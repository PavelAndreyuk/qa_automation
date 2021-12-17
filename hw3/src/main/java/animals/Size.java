package animals;

import java.util.Comparator;

public enum Size implements Comparator<Size> {
    EXTRA_SMALL,
    SMALL,
    MEDIUM,
    LARGE;

    @Override
    public int compare(Size o1, Size o2) {
        if (o1 == Size.LARGE) {
            switch (o2) {
                case LARGE:
                    return 0;
                case MEDIUM:
                    return -1;
                case SMALL:
                    return -1;
                case EXTRA_SMALL:
                    return -1;
            }
        }

        if (o1 == Size.MEDIUM) {
            switch (o2) {
                case LARGE:
                    return 1;
                case MEDIUM:
                    return 0;
                case SMALL:
                    return -1;
                case EXTRA_SMALL:
                    return -1;
            }
        }

        if (o1 == Size.SMALL) {
            switch (o2) {
                case LARGE:
                    return 1;
                case MEDIUM:
                    return 1;
                case SMALL:
                    return 0;
                case EXTRA_SMALL:
                    return -1;
            }
        }

        if (o1 == Size.EXTRA_SMALL) {
            switch (o2) {
                case LARGE:
                    return 1;
                case MEDIUM:
                    return 1;
                case SMALL:
                    return 1;
                case EXTRA_SMALL:
                    return 0;
            }
        }
        return 0;
    }
}
