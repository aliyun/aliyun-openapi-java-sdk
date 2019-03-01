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

package com.aliyuncs.edas.model.v20170801;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateJvmConfigurationRequest extends RoaAcsRequest<UpdateJvmConfigurationResponse> {
	
	public UpdateJvmConfigurationRequest() {
		super("Edas", "2017-08-01", "UpdateJvmConfiguration", "edas");
		setUriPattern("/pop/v5/app/app_jvm_config");
		setMethod(MethodType.POST);
	}

	private Integer minHeapSize;

	private String appId;

	private String groupId;

	private String options;

	private Integer maxPermSize;

	private Integer maxHeapSize;

	public Integer getMinHeapSize() {
		return this.minHeapSize;
	}

	public void setMinHeapSize(Integer minHeapSize) {
		this.minHeapSize = minHeapSize;
		if(minHeapSize != null){
			putQueryParameter("MinHeapSize", minHeapSize.toString());
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId);
		}
	}

	public String getOptions() {
		return this.options;
	}

	public void setOptions(String options) {
		this.options = options;
		if(options != null){
			putQueryParameter("Options", options);
		}
	}

	public Integer getMaxPermSize() {
		return this.maxPermSize;
	}

	public void setMaxPermSize(Integer maxPermSize) {
		this.maxPermSize = maxPermSize;
		if(maxPermSize != null){
			putQueryParameter("MaxPermSize", maxPermSize.toString());
		}
	}

	public Integer getMaxHeapSize() {
		return this.maxHeapSize;
	}

	public void setMaxHeapSize(Integer maxHeapSize) {
		this.maxHeapSize = maxHeapSize;
		if(maxHeapSize != null){
			putQueryParameter("MaxHeapSize", maxHeapSize.toString());
		}
	}

	@Override
	public Class<UpdateJvmConfigurationResponse> getResponseClass() {
		return UpdateJvmConfigurationResponse.class;
	}

}
