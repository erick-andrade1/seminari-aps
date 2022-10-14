export abstract class TemplateMethodBaseClass {
    // Este é o template method (final)
    readonly templateMethod = (): void => {
        this.stepA();
        this.hook();
        this.stepB();
    }

    abstract stepA(): void; // As classes concretas devem definir
    abstract stepB(): void; // As classes concretas devem definir
    hook(): void {} // As classes concretas podem usar
}

export class ConcreteTemplateMethod extends TemplateMethodBaseClass {
    stepA(): void {
        console.log('A - stepA');
    }

    stepB(): void {
        console.log('B - stepB');
    }

    hook(): void {
        console.log('A - Hook used');
    }
}


const concrete = new ConcreteTemplateMethod();
concrete.templateMethod();