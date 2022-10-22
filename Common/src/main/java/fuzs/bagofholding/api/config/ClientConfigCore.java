package fuzs.bagofholding.api.config;

public interface ClientConfigCore {

    boolean colorfulTooltips();

    boolean contentsRequireShift();

    SlotOverlay slotOverlay();

    boolean containerItemIndicator();

    enum SlotOverlay {
        NONE, HOTBAR, HOVER
    }
}
