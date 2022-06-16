package top.lintao.springjavamavenbase.interface_abstract_class.kotlin_version;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.script.experimental.jvm.RunnerKt;
import kotlin.script.templates.standard.ScriptTemplateWithArgs;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 6, 0},
        k = 1,
        xi = 4,
        d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001:\b\u0005\u0006\u0007\b\t\n\u000b\fB\u000e\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\r"},
        d2 = {"LScratch_231;", "Lkotlin/script/templates/standard/ScriptTemplateWithArgs;", "args", "", "", "Model1", "Model2",
                "ModelAbstract", "ModelAbstract1", "ModelAbstract2", "ModelAbstract91", "ModelAbstractVal", "ModelInterface",
                "script scratch_231.kts Kotlin Script"}
)
public class Scratch_231 extends ScriptTemplateWithArgs {
    public static final void main(String[] var0) {
        RunnerKt.runCompiledScript(Scratch_231.class, var0);
    }

    public Scratch_231(String[] var1) {
        super(var1);
    }

    @Metadata(
            mv = {1, 6, 0},
            k = 1,
            d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"},
            d2 = {"LScratch_231$Model1;", "LScratch_231$ModelInterface;", "name", "", "age", "", "(Ljava/lang/String;I)V", "getAge", "()I",
                    "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode",
                    "toString", "script scratch_231.kts Kotlin Script"}
    )
    public static final class Model1 implements Scratch_231.ModelInterface {
        @NotNull
        private final String name;
        private final int age;

        @NotNull
        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }

        public Model1(@NotNull String name, int age) {
            Intrinsics.checkNotNullParameter(name, "name");
            super();
            this.name = name;
            this.age = age;
        }

        @NotNull
        public final String component1() {
            return this.getName();
        }

        public final int component2() {
            return this.getAge();
        }

        @NotNull
        public final Scratch_231.Model1 copy(@NotNull String name, int age) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new Scratch_231.Model1(name, age);
        }

        // $FF: synthetic method
        public static Scratch_231.Model1 copy$default(Scratch_231.Model1 var0, String var1, int var2, int var3, Object var4) {
            if ((var3 & 1) != 0) {
                var1 = var0.getName();
            }

            if ((var3 & 2) != 0) {
                var2 = var0.getAge();
            }

            return var0.copy(var1, var2);
        }

        @NotNull
        public String toString() {
            return "Model1(name=" + this.getName() + ", age=" + this.getAge() + ")";
        }

        public int hashCode() {
            String var10000 = this.getName();
            return (var10000 != null ? var10000.hashCode() : 0) * 31 + Integer.hashCode(this.getAge());
        }

        public boolean equals(@Nullable Object var1) {
            if (this != var1) {
                if (var1 instanceof Scratch_231.Model1) {
                    Scratch_231.Model1 var2 = (Scratch_231.Model1) var1;
                    if (Intrinsics.areEqual(this.getName(), var2.getName()) && this.getAge() == var2.getAge()) {
                        return true;
                    }
                }

                return false;
            } else {
                return true;
            }
        }
    }

    @Metadata(
            mv = {1, 6, 0},
            k = 1,
            d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0006\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"},
            d2 = {"LScratch_231$Model2;", "LScratch_231$ModelInterface;", "name", "", "age", "", "other",
                    "(Ljava/lang/String;ILjava/lang/String;)V", "getAge", "()I", "getName", "()Ljava/lang/String;", "getOther",
                    "component1", "component2", "component3", "copy", "equals", "", "", "hashCode", "toString",
                    "script scratch_231.kts Kotlin Script"}
    )
    public static final class Model2 implements Scratch_231.ModelInterface {
        @NotNull
        private final String name;
        private final int age;
        @NotNull
        private final String other;

        @NotNull
        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }

        @NotNull
        public final String getOther() {
            return this.other;
        }

        public Model2(@NotNull String name, int age, @NotNull String other) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(other, "other");
            super();
            this.name = name;
            this.age = age;
            this.other = other;
        }

        @NotNull
        public final String component1() {
            return this.getName();
        }

        public final int component2() {
            return this.getAge();
        }

        @NotNull
        public final String component3() {
            return this.other;
        }

        @NotNull
        public final Scratch_231.Model2 copy(@NotNull String name, int age, @NotNull String other) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(other, "other");
            return new Scratch_231.Model2(name, age, other);
        }

        // $FF: synthetic method
        public static Scratch_231.Model2 copy$default(Scratch_231.Model2 var0, String var1, int var2, String var3, int var4, Object var5) {
            if ((var4 & 1) != 0) {
                var1 = var0.getName();
            }

            if ((var4 & 2) != 0) {
                var2 = var0.getAge();
            }

            if ((var4 & 4) != 0) {
                var3 = var0.other;
            }

            return var0.copy(var1, var2, var3);
        }

        @NotNull
        public String toString() {
            return "Model2(name=" + this.getName() + ", age=" + this.getAge() + ", other=" + this.other + ")";
        }

        public int hashCode() {
            String var10000 = this.getName();
            int var1 = ((var10000 != null ? var10000.hashCode() : 0) * 31 + Integer.hashCode(this.getAge())) * 31;
            String var10001 = this.other;
            return var1 + (var10001 != null ? var10001.hashCode() : 0);
        }

        public boolean equals(@Nullable Object var1) {
            if (this != var1) {
                if (var1 instanceof Scratch_231.Model2) {
                    Scratch_231.Model2 var2 = (Scratch_231.Model2) var1;
                    if (Intrinsics.areEqual(this.getName(), var2.getName()) && this.getAge() == var2.getAge() &&
                            Intrinsics.areEqual(this.other, var2.other)) {
                        return true;
                    }
                }

                return false;
            } else {
                return true;
            }
        }
    }

    @Metadata(
            mv = {1, 6, 0},
            k = 1,
            d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"},
            d2 = {"LScratch_231$ModelInterface;", "", "age", "", "getAge", "()I", "name", "", "getName", "()Ljava/lang/String;",
                    "script scratch_231.kts Kotlin Script"}
    )
    public interface ModelInterface {
        @NotNull
        String getName();

        int getAge();
    }

    @Metadata(
            mv = {1, 6, 0},
            k = 1,
            d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"},
            d2 = {"LScratch_231$ModelAbstract1;", "LScratch_231$ModelAbstract;", "name", "", "age", "", "(Ljava/lang/String;I)V", "getAge",
                    "()I", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode",
                    "toString", "script scratch_231.kts Kotlin Script"}
    )
    public static final class ModelAbstract1 extends Scratch_231.ModelAbstract {
        @NotNull
        private final String name;
        private final int age;

        @NotNull
        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }

        public ModelAbstract1(@NotNull String name, int age) {
            Intrinsics.checkNotNullParameter(name, "name");
            super();
            this.name = name;
            this.age = age;
        }

        @NotNull
        public final String component1() {
            return this.getName();
        }

        public final int component2() {
            return this.getAge();
        }

        @NotNull
        public final Scratch_231.ModelAbstract1 copy(@NotNull String name, int age) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new Scratch_231.ModelAbstract1(name, age);
        }

        // $FF: synthetic method
        public static Scratch_231.ModelAbstract1 copy$default(Scratch_231.ModelAbstract1 var0, String var1, int var2, int var3,
                                                              Object var4) {
            if ((var3 & 1) != 0) {
                var1 = var0.getName();
            }

            if ((var3 & 2) != 0) {
                var2 = var0.getAge();
            }

            return var0.copy(var1, var2);
        }

        @NotNull
        public String toString() {
            return "ModelAbstract1(name=" + this.getName() + ", age=" + this.getAge() + ")";
        }

        public int hashCode() {
            String var10000 = this.getName();
            return (var10000 != null ? var10000.hashCode() : 0) * 31 + Integer.hashCode(this.getAge());
        }

        public boolean equals(@Nullable Object var1) {
            if (this != var1) {
                if (var1 instanceof Scratch_231.ModelAbstract1) {
                    Scratch_231.ModelAbstract1 var2 = (Scratch_231.ModelAbstract1) var1;
                    if (Intrinsics.areEqual(this.getName(), var2.getName()) && this.getAge() == var2.getAge()) {
                        return true;
                    }
                }

                return false;
            } else {
                return true;
            }
        }
    }

    @Metadata(
            mv = {1, 6, 0},
            k = 1,
            d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0006\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"},
            d2 = {"LScratch_231$ModelAbstract2;", "LScratch_231$ModelAbstract;", "name", "", "age", "", "other",
                    "(Ljava/lang/String;ILjava/lang/String;)V", "getAge", "()I", "getName", "()Ljava/lang/String;", "getOther",
                    "component1", "component2", "component3", "copy", "equals", "", "", "hashCode", "toString",
                    "script scratch_231.kts Kotlin Script"}
    )
    public static final class ModelAbstract2 extends Scratch_231.ModelAbstract {
        @NotNull
        private final String name;
        private final int age;
        @NotNull
        private final String other;

        @NotNull
        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }

        @NotNull
        public final String getOther() {
            return this.other;
        }

        public ModelAbstract2(@NotNull String name, int age, @NotNull String other) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(other, "other");
            super();
            this.name = name;
            this.age = age;
            this.other = other;
        }

        @NotNull
        public final String component1() {
            return this.getName();
        }

        public final int component2() {
            return this.getAge();
        }

        @NotNull
        public final String component3() {
            return this.other;
        }

        @NotNull
        public final Scratch_231.ModelAbstract2 copy(@NotNull String name, int age, @NotNull String other) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(other, "other");
            return new Scratch_231.ModelAbstract2(name, age, other);
        }

        // $FF: synthetic method
        public static Scratch_231.ModelAbstract2 copy$default(Scratch_231.ModelAbstract2 var0, String var1, int var2, String var3, int var4,
                                                              Object var5) {
            if ((var4 & 1) != 0) {
                var1 = var0.getName();
            }

            if ((var4 & 2) != 0) {
                var2 = var0.getAge();
            }

            if ((var4 & 4) != 0) {
                var3 = var0.other;
            }

            return var0.copy(var1, var2, var3);
        }

        @NotNull
        public String toString() {
            return "ModelAbstract2(name=" + this.getName() + ", age=" + this.getAge() + ", other=" + this.other + ")";
        }

        public int hashCode() {
            String var10000 = this.getName();
            int var1 = ((var10000 != null ? var10000.hashCode() : 0) * 31 + Integer.hashCode(this.getAge())) * 31;
            String var10001 = this.other;
            return var1 + (var10001 != null ? var10001.hashCode() : 0);
        }

        public boolean equals(@Nullable Object var1) {
            if (this != var1) {
                if (var1 instanceof Scratch_231.ModelAbstract2) {
                    Scratch_231.ModelAbstract2 var2 = (Scratch_231.ModelAbstract2) var1;
                    if (Intrinsics.areEqual(this.getName(), var2.getName()) && this.getAge() == var2.getAge() &&
                            Intrinsics.areEqual(this.other, var2.other)) {
                        return true;
                    }
                }

                return false;
            } else {
                return true;
            }
        }
    }

    @Metadata(
            mv = {1, 6, 0},
            k = 1,
            d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"},
            d2 = {"LScratch_231$ModelAbstract;", "", "()V", "age", "", "getAge", "()I", "name", "", "getName", "()Ljava/lang/String;",
                    "script scratch_231.kts Kotlin Script"}
    )
    public abstract static class ModelAbstract {
        @NotNull
        public abstract String getName();

        public abstract int getAge();
    }

    @Metadata(
            mv = {1, 6, 0},
            k = 1,
            d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"},
            d2 = {"LScratch_231$ModelAbstract91;", "LScratch_231$ModelAbstractVal;", "name", "", "age", "", "(Ljava/lang/String;I)V",
                    "script scratch_231.kts Kotlin Script"}
    )
    public static final class ModelAbstract91 extends Scratch_231.ModelAbstractVal {
        public ModelAbstract91(@NotNull String name, int age) {
            Intrinsics.checkNotNullParameter(name, "name");
            super(name, age);
        }
    }

    @Metadata(
            mv = {1, 6, 0},
            k = 1,
            d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"},
            d2 = {"LScratch_231$ModelAbstractVal;", "", "name", "", "age", "", "(Ljava/lang/String;I)V", "getAge", "()I", "getName",
                    "()Ljava/lang/String;", "script scratch_231.kts Kotlin Script"}
    )
    public abstract static class ModelAbstractVal {
        @NotNull
        private final String name;
        private final int age;

        @NotNull
        public final String getName() {
            return this.name;
        }

        public final int getAge() {
            return this.age;
        }

        public ModelAbstractVal(@NotNull String name, int age) {
            Intrinsics.checkNotNullParameter(name, "name");
            super();
            this.name = name;
            this.age = age;
        }
    }
}

