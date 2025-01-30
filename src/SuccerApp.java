import java.util.Scanner;

public class SuccerApp {

    static int readInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static class Menu {

        static boolean selected;

        static int showMenu() {
            System.out.println("1 - Модуль администратора");
            System.out.println("2 - Модуль пользователя");
            System.out.println("3 - Выйти");

            return SuccerApp.readInput();
        }
    }

    public static class AdminModule {
        static boolean selected;
        static int ShowAdminModule() {
            selected = true;
            System.out.println("1 - Работа с учетными записями");
            System.out.println("2 - Работа с данными");
            System.out.println("3 - Назад");
            return SuccerApp.readInput();
        }
    }

    public static class UserModule {
        static boolean selected;
        static int ShowUserModule () {
            System.out.println("1 - Работа с данными");
            System.out.println("2 - Инд.задание");
            System.out.println("3 - Поиск");
            System.out.println("4 - Сортировка");
            System.out.println("5 - Назад");
            return SuccerApp.readInput();
        }
    }

    public static class Accounts {
        static boolean selected;
            static int ShowAccounts(){
                System.out.println("1 - Просмотр");
                System.out.println("2 - Добавление");
                System.out.println("3 - Редактирование");
                System.out.println("4 - Удаление");
                System.out.println("5 - Назад");
                return SuccerApp.readInput();

        }
    }

    public static class WorkWithData {
        static boolean selected = false;

        static int ShowWorkWithData(){
            System.out.println("1 - Режим редактирования");
            System.out.println("2 - Режим обработки");
            System.out.println("3 - Назад");
            return SuccerApp.readInput();
        }
    }

    public static class EditingMode {
        static boolean selected = false;
        static int ShowEditingMode() {
            System.out.println("1 - Просмотр");
            System.out.println("2 - Добавление");
            System.out.println("3 - Редактирование");
            System.out.println("4 - Удаление");
            System.out.println("5 - Назад");
            return SuccerApp.readInput();
        }
    }

    public static class ProcessingMode {
        static boolean selected;
        static int ShowProcessingMode() {
            System.out.println("1 - Индивидуальное задание");
            System.out.println("2 - Поиск");
            System.out.println("3 - Сортировка");
            System.out.println("4 - Назад");
            return SuccerApp.readInput();
        }
    }

    public static void main(String[] args) {
        Menu.selected = true;
        while (Menu.selected) {
            int result = Menu.showMenu();

            switch (result) {
                case 1:
                    AdminModule.selected = true;

                    while (AdminModule.selected) {
                        result = AdminModule.ShowAdminModule();

                        if (result == 1) {
                            Accounts.selected = true;
                            while (Accounts.selected) {
                                result = Accounts.ShowAccounts();

                                if (result == 5) {
                                    Accounts.selected = false;
                                }
                            }
                        }

                        if (result == 2) {
                            WorkWithData.selected = true;

                            while (WorkWithData.selected) {
                                result = WorkWithData.ShowWorkWithData();

                                if (result == 1) {
                                    EditingMode.selected = true;
                                    while (EditingMode.selected) {
                                        result = EditingMode.ShowEditingMode();
                                        if (result == 5) {
                                            EditingMode.selected = false;
                                        }
                                    }

                                }
                                if (result == 2) {
                                    ProcessingMode.selected = true;
                                    while (ProcessingMode.selected) {
                                        result = ProcessingMode.ShowProcessingMode();

                                        if (result == 4) {
                                            ProcessingMode.selected = false;
                                        }
                                    }

                                }
                                if (result == 3) {
                                    WorkWithData.selected = false;
                                }
                            }
                        }

                        if (result == 3) {
                            AdminModule.selected = false;
                        }
                    }

                    break;
                    case 2:
                        UserModule.selected = true;

                        while (UserModule.selected) {
                            result = UserModule.ShowUserModule();

                            if (result == 5) {
                                UserModule.selected = false;
                            }
                        }
                    break;
                    case 3: Menu.selected = false;
                    break;

                    default: System.out.println("Вы ввели неверное число!");
                }
            }
        }
    }