
package io.fabric8.openshift.api.model.operator.v1;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.builder.Editable;
import io.fabric8.kubernetes.api.model.Container;
import io.fabric8.kubernetes.api.model.IntOrString;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.fabric8.kubernetes.api.model.LabelSelector;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim;
import io.fabric8.kubernetes.api.model.PodTemplateSpec;
import io.fabric8.kubernetes.api.model.ResourceRequirements;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "internalJoinSubnet",
    "internalTransitSwitchSubnet"
})
@ToString
@EqualsAndHashCode
@Accessors(prefix = {
    "_",
    ""
})
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, lazyCollectionInitEnabled = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
    @BuildableReference(ObjectMeta.class),
    @BuildableReference(LabelSelector.class),
    @BuildableReference(Container.class),
    @BuildableReference(PodTemplateSpec.class),
    @BuildableReference(ResourceRequirements.class),
    @BuildableReference(IntOrString.class),
    @BuildableReference(ObjectReference.class),
    @BuildableReference(LocalObjectReference.class),
    @BuildableReference(PersistentVolumeClaim.class)
})
@Generated("jsonschema2pojo")
public class NetworkSpecDNOKCIpv4 implements Editable<NetworkSpecDNOKCIpv4Builder> , KubernetesResource
{

    @JsonProperty("internalJoinSubnet")
    private String internalJoinSubnet;
    @JsonProperty("internalTransitSwitchSubnet")
    private String internalTransitSwitchSubnet;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public NetworkSpecDNOKCIpv4() {
    }

    public NetworkSpecDNOKCIpv4(String internalJoinSubnet, String internalTransitSwitchSubnet) {
        super();
        this.internalJoinSubnet = internalJoinSubnet;
        this.internalTransitSwitchSubnet = internalTransitSwitchSubnet;
    }

    @JsonProperty("internalJoinSubnet")
    public String getInternalJoinSubnet() {
        return internalJoinSubnet;
    }

    @JsonProperty("internalJoinSubnet")
    public void setInternalJoinSubnet(String internalJoinSubnet) {
        this.internalJoinSubnet = internalJoinSubnet;
    }

    @JsonProperty("internalTransitSwitchSubnet")
    public String getInternalTransitSwitchSubnet() {
        return internalTransitSwitchSubnet;
    }

    @JsonProperty("internalTransitSwitchSubnet")
    public void setInternalTransitSwitchSubnet(String internalTransitSwitchSubnet) {
        this.internalTransitSwitchSubnet = internalTransitSwitchSubnet;
    }

    @JsonIgnore
    public NetworkSpecDNOKCIpv4Builder edit() {
        return new NetworkSpecDNOKCIpv4Builder(this);
    }

    @JsonIgnore
    public NetworkSpecDNOKCIpv4Builder toBuilder() {
        return edit();
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

}