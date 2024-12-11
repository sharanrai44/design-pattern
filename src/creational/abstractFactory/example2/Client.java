package creational.abstractFactory.example2;

public class Client {
    private ResourceFactory factory;

    public Client(ResourceFactory factory) {
        this.factory = factory;
    }

    public Instance createServer(Instance.Capacity capacity, int storageInMib) {
        Instance instance = factory.createInstance(capacity);
        Storage storage = factory.createStorage(storageInMib);
        instance.attachStorage(storage);
        return instance;
    }

    public static void main(String[] args) {
        Client aws = new Client(new AmazonResourceGenerator());
       Instance i1= aws.createServer(Instance.Capacity.micro, 20480);
        i1.start();
        i1.stop();

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        Client gcp= new Client(new GoogleCloudResourceGenerator());
        i1=  gcp.createServer(Instance.Capacity.large,204800);
        i1.start();
        i1.stop();
    }
}
