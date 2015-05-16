
package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.fabric8.openshift.api.model.BuildConfig;
import io.fabric8.openshift.api.model.DeploymentConfig;
import io.fabric8.openshift.api.model.ImageStream;
import io.fabric8.openshift.api.model.Route;
import io.fabric8.openshift.api.model.template.Template;

import javax.annotation.Generated;
import java.util.*;


/**
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "annotations",
    "apiVersion",
    "creationTimestamp",
    "deletionTimestamp",
    "generateName",
    "id",
    "items",
    "kind",
    "namespace",
    "resourceVersion",
    "selfLink",
    "uid"
})

public class KubernetesList extends BaseKubernetesList {

    /**
     * list of services
     * Note: This is not to be used. Added for influencing the generation of fluent nested builders
     */
    @JsonIgnore
    private final List<Service> services = new ArrayList<>();

    /**
     * list of replication controllers
     * Note: This is not to be used. Added for influencing the generation of fluent nested builders
     */
    @JsonIgnore
    private final List<ReplicationController> replicationControllers = new ArrayList<>();

    /**
     * list of pods. 
     * Note: This is not to be used. Added for influencing the generation of fluent nested builders 
     *
     */
    @JsonIgnore
    private final List<Pod> pods = new ArrayList<>();
    
    /**
     * list of build configs
     * Note: This is not to be used. Added for influencing the generation of fluent nested builders
     *
     */
    @JsonIgnore
    private final List<BuildConfig> buildConfigs = new ArrayList<>();

    /**
     * list of deployment configs
     * Note: This is not to be used. Added for influencing the generation of fluent nested builders
     */
    @JsonIgnore
    private final List<DeploymentConfig> deploymentConfigs = new ArrayList<>();

    /**
     * list of image repositories
     * Note: This is not to be used. Added for influencing the generation of fluent nested builders
     */
    @JsonIgnore
    private final List<ImageStream> imageStreams = new ArrayList<>();

    /**
     * list of routes
     * Note: This is not to be used. Added for influencing the generation of fluent nested builders.
     */
    @JsonIgnore
    private final List<Route> routes = new ArrayList<>();

    /**
     * list of routes
     * Note: This is not to be used. Added for influencing the generation of fluent nested builders.
     */
    @JsonIgnore
    private final List<Template> templates = new ArrayList<>();
    
    /**
     * No args constructor for use in serialization
     *
     */
    public KubernetesList() {
        super();
    }

    public KubernetesList(KubernetesList.ApiVersion apiVersion,
                          List<Object> items,
                          String kind,
                          ListMeta metadata,
                          List<Service> services,
                          List<ReplicationController> replicationControllers,
                          List<Pod> pods,
                          List<BuildConfig> buildConfigs,
                          List<DeploymentConfig> deploymentConfigs,
                          List<ImageStream> imageStreams,
                          List<Route> routes,
                          List<Template> templates) {
        super(apiVersion, items, kind, metadata);

        this.setItems(items);
        this.services.addAll(services != null ? services : Collections.<Service>emptyList());
        this.replicationControllers.addAll(replicationControllers != null ? replicationControllers : Collections.<ReplicationController>emptyList());
        this.pods.addAll(pods != null ? pods : Collections.<Pod>emptyList());
        this.buildConfigs.addAll(buildConfigs != null ? buildConfigs : Collections.<BuildConfig>emptyList());
        this.deploymentConfigs.addAll(deploymentConfigs != null ? deploymentConfigs : Collections.<DeploymentConfig>emptyList());
        this.imageStreams.addAll(imageStreams != null ? imageStreams : Collections.<ImageStream>emptyList());
        this.routes.addAll(routes != null ? routes : Collections.<Route>emptyList());
        this.templates.addAll(templates != null ? templates : Collections.<Template>emptyList());
    }

    /**
     * list of objects
     *
     * @return
     *     The items
     */
    @JsonProperty("items")
    @Override
    public List<Object> getItems() {
        List<Object> allItems = new ArrayList<>(super.getItems());
        allItems.addAll(services);
        allItems.addAll(replicationControllers);
        allItems.addAll(pods);
        allItems.addAll(buildConfigs);
        allItems.addAll(deploymentConfigs);
        allItems.addAll(imageStreams);
        allItems.addAll(routes);
        allItems.addAll(templates);
        return allItems;
    }

    @JsonProperty("items")
    @JsonTypeInfo(
            use = JsonTypeInfo.Id.NAME,
            include = JsonTypeInfo.As.PROPERTY,
            property = "kind")
    @JsonSubTypes({
            @JsonSubTypes.Type(value = KubernetesList.class, name = "List"),
            @JsonSubTypes.Type(value = Service.class, name = "Service"),
            @JsonSubTypes.Type(value = Pod.class, name = "Pod"),
            @JsonSubTypes.Type(value = ReplicationController.class, name = "ReplicationController"),
            @JsonSubTypes.Type(value = BuildConfig.class, name = "BuildConfig"),
            @JsonSubTypes.Type(value = DeploymentConfig.class, name = "DeploymentConfig"),
            @JsonSubTypes.Type(value = ImageStream.class, name = "ImageStream"),
            @JsonSubTypes.Type(value = Route.class, name = "Route"),
            @JsonSubTypes.Type(value = Template.class, name = "Template")

    })
    @Override
    public void setItems(List<Object> items) {
        for (Object item : items) {
            if (item instanceof Service) {
                this.services.add((Service) item);
            } else if (item instanceof ReplicationController) {
                this.replicationControllers.add((ReplicationController) item);
            } else if (item instanceof Pod) {
                this.pods.add((Pod) item);
            } else if (item instanceof BuildConfig) {
                this.buildConfigs.add((BuildConfig) item);
            } else if (item instanceof DeploymentConfig) {
                this.deploymentConfigs.add((DeploymentConfig) item);
            } else if (item instanceof ImageStream) {
                this.imageStreams.add((ImageStream) item);
            } else if (item instanceof Route) {
                this.routes.add((Route) item);
            } else if (item instanceof Template) {
                this.templates.add((Template) item);
            }
        }
    }

    @JsonIgnore
    public List<Service> getServices() {
        return services;
    }
    
    @JsonIgnore
    public List<ReplicationController> getReplicationControllers() {
        return replicationControllers;
    }

    @JsonIgnore
    public List<Pod> getPods() {
        return pods;
    }
    
    @JsonIgnore
    public List<BuildConfig> getBuildConfigs() {
        return buildConfigs;
    }
    
    @JsonIgnore
    public List<DeploymentConfig> getDeploymentConfigs() {
        return deploymentConfigs;
    }
    
    @JsonIgnore
    public List<ImageStream> getImageStreams() {
        return imageStreams;
    }
    
    @JsonIgnore
    public List<Route> getRoutes() {
        return routes;
    }

    @JsonIgnore
    public List<Template> getTemplates() {
        return templates;
    }

}
