
module de.saxsys.mvvmfx.examples.jigsaw.circle {

    requires javafx.base;
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires mvvmfx;

    exports de.saxsys.mvvmfx.examples.jigsaw.circle to javafx.graphics, de.saxsys.mvvmfx.examples.jigsaw.app;

    opens de.saxsys.mvvmfx.examples.jigsaw.circle to mvvmfx, javafx.fxml;
}