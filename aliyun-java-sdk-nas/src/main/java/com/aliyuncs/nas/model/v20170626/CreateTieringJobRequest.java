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

package com.aliyuncs.nas.model.v20170626;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateTieringJobRequest extends RpcAcsRequest<CreateTieringJobResponse> {
	
	public CreateTieringJobRequest() {
		super("NAS", "2017-06-26", "CreateTieringJob", "NAS");
	}

	private String volume;

	private String path;

	private Integer hour;

	private String name;

	private Integer weekday;

	private String type;

	private Boolean recursive;

	private Boolean enabled;

	private String policy;

	public String getVolume() {
		return this.volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
		if(volume != null){
			putQueryParameter("Volume", volume);
		}
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
		if(path != null){
			putQueryParameter("Path", path);
		}
	}

	public Integer getHour() {
		return this.hour;
	}

	public void setHour(Integer hour) {
		this.hour = hour;
		if(hour != null){
			putQueryParameter("Hour", hour.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public Integer getWeekday() {
		return this.weekday;
	}

	public void setWeekday(Integer weekday) {
		this.weekday = weekday;
		if(weekday != null){
			putQueryParameter("Weekday", weekday.toString());
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public Boolean getRecursive() {
		return this.recursive;
	}

	public void setRecursive(Boolean recursive) {
		this.recursive = recursive;
		if(recursive != null){
			putQueryParameter("Recursive", recursive.toString());
		}
	}

	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		if(enabled != null){
			putQueryParameter("Enabled", enabled.toString());
		}
	}

	public String getPolicy() {
		return this.policy;
	}

	public void setPolicy(String policy) {
		this.policy = policy;
		if(policy != null){
			putQueryParameter("Policy", policy);
		}
	}

	@Override
	public Class<CreateTieringJobResponse> getResponseClass() {
		return CreateTieringJobResponse.class;
	}

}
