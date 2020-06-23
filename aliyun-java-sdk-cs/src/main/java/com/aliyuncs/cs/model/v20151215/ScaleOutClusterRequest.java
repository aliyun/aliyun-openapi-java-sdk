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
public class ScaleOutClusterRequest extends RoaAcsRequest<ScaleOutClusterResponse> {
	   

	private Boolean worker_data_disk;

	private String key_pair;

	private Integer count;

	private String worker_system_disk_category;

	private Boolean cloud_monitor_flags;

	private String clusterId;

	private String worker_period_unit;

	private Boolean worker_auto_renew;

	private Integer worker_auto_renew_period;

	private Integer worker_period;

	private String login_password;

	private Integer worker_system_disk_size;

	private String cpu_policy;

	private Boolean disable_rollback;

	private String worker_instance_charge_type;
	public ScaleOutClusterRequest() {
		super("CS", "2015-12-15", "ScaleOutCluster");
		setUriPattern("/api/v2/clusters/[ClusterId]");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getWorker_data_disk() {
		return this.worker_data_disk;
	}

	public void setWorker_data_disk(Boolean worker_data_disk) {
		this.worker_data_disk = worker_data_disk;
		if(worker_data_disk != null){
			putBodyParameter("worker_data_disk", worker_data_disk.toString());
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

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
		if(count != null){
			putBodyParameter("count", count.toString());
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

	public Boolean getCloud_monitor_flags() {
		return this.cloud_monitor_flags;
	}

	public void setCloud_monitor_flags(Boolean cloud_monitor_flags) {
		this.cloud_monitor_flags = cloud_monitor_flags;
		if(cloud_monitor_flags != null){
			putBodyParameter("cloud_monitor_flags", cloud_monitor_flags.toString());
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putPathParameter("ClusterId", clusterId);
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

	public Boolean getWorker_auto_renew() {
		return this.worker_auto_renew;
	}

	public void setWorker_auto_renew(Boolean worker_auto_renew) {
		this.worker_auto_renew = worker_auto_renew;
		if(worker_auto_renew != null){
			putBodyParameter("worker_auto_renew", worker_auto_renew.toString());
		}
	}

	public Integer getWorker_auto_renew_period() {
		return this.worker_auto_renew_period;
	}

	public void setWorker_auto_renew_period(Integer worker_auto_renew_period) {
		this.worker_auto_renew_period = worker_auto_renew_period;
		if(worker_auto_renew_period != null){
			putBodyParameter("worker_auto_renew_period", worker_auto_renew_period.toString());
		}
	}

	public Integer getWorker_period() {
		return this.worker_period;
	}

	public void setWorker_period(Integer worker_period) {
		this.worker_period = worker_period;
		if(worker_period != null){
			putBodyParameter("worker_period", worker_period.toString());
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

	public Integer getWorker_system_disk_size() {
		return this.worker_system_disk_size;
	}

	public void setWorker_system_disk_size(Integer worker_system_disk_size) {
		this.worker_system_disk_size = worker_system_disk_size;
		if(worker_system_disk_size != null){
			putBodyParameter("worker_system_disk_size", worker_system_disk_size.toString());
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
	public Class<ScaleOutClusterResponse> getResponseClass() {
		return ScaleOutClusterResponse.class;
	}

}
