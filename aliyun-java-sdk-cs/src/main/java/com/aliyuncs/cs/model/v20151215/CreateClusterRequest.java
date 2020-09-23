/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.cs.model.v20151215;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateClusterRequest extends RoaAcsRequest<CreateClusterResponse> {
	   

	private Boolean private_zone;

	private String proxy_mode;

	private String master_system_disk_category;

	private Long master_period;

	private Boolean cloud_monitor_flags;

	private Boolean ssh_flags;

	private String security_group_id;

	private String container_cidr;

	private String cluster_type;

	private Boolean endpoint_public_access;

	private Boolean worker_auto_renew;

	private String platform;

	private String service_cidr;

	private String node_port_range;

	private String zone_id;

	private String login_password;

	private String kubernetes_version;

	private Boolean is_enterprise_security_group;

	private String master_period_unit;

	private Long master_system_disk_size;

	private Long master_count;

	private Long num_of_nodes;

	private String deletion_protection;

	private String key_pair;

	private Boolean master_auto_renew;

	private String profile;

	private String region_id;

	private Boolean snat_entry;

	private String worker_system_disk_category;

	private String user_data;

	private String worker_period_unit;

	private String master_instance_charge_type;

	private String node_cidr_mask;

	private Long worker_auto_renew_period;

	private Long master_auto_renew_period;

	private Long worker_period;

	private Long timeout_mins;

	private String images_id;

	private Long worker_system_disk_size;

	private String vpcid;

	private String os_type;

	private String cpu_policy;

	private String name;

	private Boolean disable_rollback;

	private String worker_instance_charge_type;
	public CreateClusterRequest() {
		super("CS", "2015-12-15", "CreateCluster");
		setUriPattern("/clusters");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getPrivate_zone() {
		return this.private_zone;
	}

	public void setPrivate_zone(Boolean private_zone) {
		this.private_zone = private_zone;
		if(private_zone != null){
			putBodyParameter("private_zone", private_zone.toString());
		}
	}

	public String getProxy_mode() {
		return this.proxy_mode;
	}

	public void setProxy_mode(String proxy_mode) {
		this.proxy_mode = proxy_mode;
		if(proxy_mode != null){
			putBodyParameter("proxy_mode", proxy_mode);
		}
	}

	public String getMaster_system_disk_category() {
		return this.master_system_disk_category;
	}

	public void setMaster_system_disk_category(String master_system_disk_category) {
		this.master_system_disk_category = master_system_disk_category;
		if(master_system_disk_category != null){
			putBodyParameter("master_system_disk_category", master_system_disk_category);
		}
	}

	public Long getMaster_period() {
		return this.master_period;
	}

	public void setMaster_period(Long master_period) {
		this.master_period = master_period;
		if(master_period != null){
			putBodyParameter("master_period", master_period.toString());
		}
	}

	public Boolean getCloud_monitor_flags() {
		return this.cloud_monitor_flags;
	}

	public void setCloud_monitor_flags(Boolean cloud_monitor_flags) {
		this.cloud_monitor_flags = cloud_monitor_flags;
		if(cloud_monitor_flags != null){
			putBodyParameter("cloud_monitor_flags", cloud_monitor_flags.toString());
		}
	}

	public Boolean getSsh_flags() {
		return this.ssh_flags;
	}

	public void setSsh_flags(Boolean ssh_flags) {
		this.ssh_flags = ssh_flags;
		if(ssh_flags != null){
			putBodyParameter("ssh_flags", ssh_flags.toString());
		}
	}

	public String getSecurity_group_id() {
		return this.security_group_id;
	}

	public void setSecurity_group_id(String security_group_id) {
		this.security_group_id = security_group_id;
		if(security_group_id != null){
			putBodyParameter("security_group_id", security_group_id);
		}
	}

	public String getContainer_cidr() {
		return this.container_cidr;
	}

	public void setContainer_cidr(String container_cidr) {
		this.container_cidr = container_cidr;
		if(container_cidr != null){
			putBodyParameter("container_cidr", container_cidr);
		}
	}

	public String getCluster_type() {
		return this.cluster_type;
	}

	public void setCluster_type(String cluster_type) {
		this.cluster_type = cluster_type;
		if(cluster_type != null){
			putBodyParameter("cluster_type", cluster_type);
		}
	}

	public Boolean getEndpoint_public_access() {
		return this.endpoint_public_access;
	}

	public void setEndpoint_public_access(Boolean endpoint_public_access) {
		this.endpoint_public_access = endpoint_public_access;
		if(endpoint_public_access != null){
			putBodyParameter("endpoint_public_access", endpoint_public_access.toString());
		}
	}

	public Boolean getWorker_auto_renew() {
		return this.worker_auto_renew;
	}

	public void setWorker_auto_renew(Boolean worker_auto_renew) {
		this.worker_auto_renew = worker_auto_renew;
		if(worker_auto_renew != null){
			putBodyParameter("worker_auto_renew", worker_auto_renew.toString());
		}
	}

	public String getPlatform() {
		return this.platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
		if(platform != null){
			putBodyParameter("platform", platform);
		}
	}

	public String getService_cidr() {
		return this.service_cidr;
	}

	public void setService_cidr(String service_cidr) {
		this.service_cidr = service_cidr;
		if(service_cidr != null){
			putBodyParameter("service_cidr", service_cidr);
		}
	}

	public String getNode_port_range() {
		return this.node_port_range;
	}

	public void setNode_port_range(String node_port_range) {
		this.node_port_range = node_port_range;
		if(node_port_range != null){
			putBodyParameter("node_port_range", node_port_range);
		}
	}

	public String getZone_id() {
		return this.zone_id;
	}

	public void setZone_id(String zone_id) {
		this.zone_id = zone_id;
		if(zone_id != null){
			putBodyParameter("zone_id", zone_id);
		}
	}

	public String getLogin_password() {
		return this.login_password;
	}

	public void setLogin_password(String login_password) {
		this.login_password = login_password;
		if(login_password != null){
			putBodyParameter("login_password", login_password);
		}
	}

	public String getKubernetes_version() {
		return this.kubernetes_version;
	}

	public void setKubernetes_version(String kubernetes_version) {
		this.kubernetes_version = kubernetes_version;
		if(kubernetes_version != null){
			putBodyParameter("kubernetes_version", kubernetes_version);
		}
	}

	public Boolean getIs_enterprise_security_group() {
		return this.is_enterprise_security_group;
	}

	public void setIs_enterprise_security_group(Boolean is_enterprise_security_group) {
		this.is_enterprise_security_group = is_enterprise_security_group;
		if(is_enterprise_security_group != null){
			putBodyParameter("is_enterprise_security_group", is_enterprise_security_group.toString());
		}
	}

	public String getMaster_period_unit() {
		return this.master_period_unit;
	}

	public void setMaster_period_unit(String master_period_unit) {
		this.master_period_unit = master_period_unit;
		if(master_period_unit != null){
			putBodyParameter("master_period_unit", master_period_unit);
		}
	}

	public Long getMaster_system_disk_size() {
		return this.master_system_disk_size;
	}

	public void setMaster_system_disk_size(Long master_system_disk_size) {
		this.master_system_disk_size = master_system_disk_size;
		if(master_system_disk_size != null){
			putBodyParameter("master_system_disk_size", master_system_disk_size.toString());
		}
	}

	public Long getMaster_count() {
		return this.master_count;
	}

	public void setMaster_count(Long master_count) {
		this.master_count = master_count;
		if(master_count != null){
			putBodyParameter("master_count", master_count.toString());
		}
	}

	public Long getNum_of_nodes() {
		return this.num_of_nodes;
	}

	public void setNum_of_nodes(Long num_of_nodes) {
		this.num_of_nodes = num_of_nodes;
		if(num_of_nodes != null){
			putBodyParameter("num_of_nodes", num_of_nodes.toString());
		}
	}

	public String getDeletion_protection() {
		return this.deletion_protection;
	}

	public void setDeletion_protection(String deletion_protection) {
		this.deletion_protection = deletion_protection;
		if(deletion_protection != null){
			putBodyParameter("deletion_protection", deletion_protection);
		}
	}

	public String getKey_pair() {
		return this.key_pair;
	}

	public void setKey_pair(String key_pair) {
		this.key_pair = key_pair;
		if(key_pair != null){
			putBodyParameter("key_pair", key_pair);
		}
	}

	public Boolean getMaster_auto_renew() {
		return this.master_auto_renew;
	}

	public void setMaster_auto_renew(Boolean master_auto_renew) {
		this.master_auto_renew = master_auto_renew;
		if(master_auto_renew != null){
			putBodyParameter("master_auto_renew", master_auto_renew.toString());
		}
	}

	public String getProfile() {
		return this.profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
		if(profile != null){
			putBodyParameter("profile", profile);
		}
	}

	public String getRegion_id() {
		return this.region_id;
	}

	public void setRegion_id(String region_id) {
		this.region_id = region_id;
		if(region_id != null){
			putBodyParameter("region_id", region_id);
		}
	}

	public Boolean getSnat_entry() {
		return this.snat_entry;
	}

	public void setSnat_entry(Boolean snat_entry) {
		this.snat_entry = snat_entry;
		if(snat_entry != null){
			putBodyParameter("snat_entry", snat_entry.toString());
		}
	}

	public String getWorker_system_disk_category() {
		return this.worker_system_disk_category;
	}

	public void setWorker_system_disk_category(String worker_system_disk_category) {
		this.worker_system_disk_category = worker_system_disk_category;
		if(worker_system_disk_category != null){
			putBodyParameter("worker_system_disk_category", worker_system_disk_category);
		}
	}

	public String getUser_data() {
		return this.user_data;
	}

	public void setUser_data(String user_data) {
		this.user_data = user_data;
		if(user_data != null){
			putBodyParameter("user_data", user_data);
		}
	}

	public String getWorker_period_unit() {
		return this.worker_period_unit;
	}

	public void setWorker_period_unit(String worker_period_unit) {
		this.worker_period_unit = worker_period_unit;
		if(worker_period_unit != null){
			putBodyParameter("worker_period_unit", worker_period_unit);
		}
	}

	public String getMaster_instance_charge_type() {
		return this.master_instance_charge_type;
	}

	public void setMaster_instance_charge_type(String master_instance_charge_type) {
		this.master_instance_charge_type = master_instance_charge_type;
		if(master_instance_charge_type != null){
			putBodyParameter("master_instance_charge_type", master_instance_charge_type);
		}
	}

	public String getNode_cidr_mask() {
		return this.node_cidr_mask;
	}

	public void setNode_cidr_mask(String node_cidr_mask) {
		this.node_cidr_mask = node_cidr_mask;
		if(node_cidr_mask != null){
			putBodyParameter("node_cidr_mask", node_cidr_mask);
		}
	}

	public Long getWorker_auto_renew_period() {
		return this.worker_auto_renew_period;
	}

	public void setWorker_auto_renew_period(Long worker_auto_renew_period) {
		this.worker_auto_renew_period = worker_auto_renew_period;
		if(worker_auto_renew_period != null){
			putBodyParameter("worker_auto_renew_period", worker_auto_renew_period.toString());
		}
	}

	public Long getMaster_auto_renew_period() {
		return this.master_auto_renew_period;
	}

	public void setMaster_auto_renew_period(Long master_auto_renew_period) {
		this.master_auto_renew_period = master_auto_renew_period;
		if(master_auto_renew_period != null){
			putBodyParameter("master_auto_renew_period", master_auto_renew_period.toString());
		}
	}

	public Long getWorker_period() {
		return this.worker_period;
	}

	public void setWorker_period(Long worker_period) {
		this.worker_period = worker_period;
		if(worker_period != null){
			putBodyParameter("worker_period", worker_period.toString());
		}
	}

	public Long getTimeout_mins() {
		return this.timeout_mins;
	}

	public void setTimeout_mins(Long timeout_mins) {
		this.timeout_mins = timeout_mins;
		if(timeout_mins != null){
			putBodyParameter("timeout_mins", timeout_mins.toString());
		}
	}

	public String getImages_id() {
		return this.images_id;
	}

	public void setImages_id(String images_id) {
		this.images_id = images_id;
		if(images_id != null){
			putBodyParameter("images_id", images_id);
		}
	}

	public Long getWorker_system_disk_size() {
		return this.worker_system_disk_size;
	}

	public void setWorker_system_disk_size(Long worker_system_disk_size) {
		this.worker_system_disk_size = worker_system_disk_size;
		if(worker_system_disk_size != null){
			putBodyParameter("worker_system_disk_size", worker_system_disk_size.toString());
		}
	}

	public String getVpcid() {
		return this.vpcid;
	}

	public void setVpcid(String vpcid) {
		this.vpcid = vpcid;
		if(vpcid != null){
			putBodyParameter("vpcid", vpcid);
		}
	}

	public String getOs_type() {
		return this.os_type;
	}

	public void setOs_type(String os_type) {
		this.os_type = os_type;
		if(os_type != null){
			putBodyParameter("os_type", os_type);
		}
	}

	public String getCpu_policy() {
		return this.cpu_policy;
	}

	public void setCpu_policy(String cpu_policy) {
		this.cpu_policy = cpu_policy;
		if(cpu_policy != null){
			putBodyParameter("cpu_policy", cpu_policy);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("name", name);
		}
	}

	public Boolean getDisable_rollback() {
		return this.disable_rollback;
	}

	public void setDisable_rollback(Boolean disable_rollback) {
		this.disable_rollback = disable_rollback;
		if(disable_rollback != null){
			putBodyParameter("disable_rollback", disable_rollback.toString());
		}
	}

	public String getWorker_instance_charge_type() {
		return this.worker_instance_charge_type;
	}

	public void setWorker_instance_charge_type(String worker_instance_charge_type) {
		this.worker_instance_charge_type = worker_instance_charge_type;
		if(worker_instance_charge_type != null){
			putBodyParameter("worker_instance_charge_type", worker_instance_charge_type);
		}
	}

	@Override
	public Class<CreateClusterResponse> getResponseClass() {
		return CreateClusterResponse.class;
	}

}
