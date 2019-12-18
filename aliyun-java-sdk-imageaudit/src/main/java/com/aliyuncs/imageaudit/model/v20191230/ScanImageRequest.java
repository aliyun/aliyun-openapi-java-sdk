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

package com.aliyuncs.imageaudit.model.v20191230;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.imageaudit.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ScanImageRequest extends RpcAcsRequest<ScanImageResponse> {
	   

	private List<String> scenes;

	private List<Task> tasks;
	public ScanImageRequest() {
		super("imageaudit", "2019-12-30", "ScanImage", "imageaudit");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getScenes() {
		return this.scenes;
	}

	public void setScenes(List<String> scenes) {
		this.scenes = scenes;	
		if (scenes != null) {
			for (int i = 0; i < scenes.size(); i++) {
				putBodyParameter("Scene." + (i + 1) , scenes.get(i));
			}
		}	
	}

	public List<Task> getTasks() {
		return this.tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;	
		if (tasks != null) {
			for (int depth1 = 0; depth1 < tasks.size(); depth1++) {
				putBodyParameter("Task." + (depth1 + 1) + ".DataId" , tasks.get(depth1).getDataId());
				putBodyParameter("Task." + (depth1 + 1) + ".ImageURL" , tasks.get(depth1).getImageURL());
				putBodyParameter("Task." + (depth1 + 1) + ".MaxFrames" , tasks.get(depth1).getMaxFrames());
				putBodyParameter("Task." + (depth1 + 1) + ".Interval" , tasks.get(depth1).getInterval());
				putBodyParameter("Task." + (depth1 + 1) + ".ImageTimeMillisecond" , tasks.get(depth1).getImageTimeMillisecond());
			}
		}	
	}

	public static class Task {

		private String dataId;

		private String imageURL;

		private Integer maxFrames;

		private Integer interval;

		private Long imageTimeMillisecond;

		public String getDataId() {
			return this.dataId;
		}

		public void setDataId(String dataId) {
			this.dataId = dataId;
		}

		public String getImageURL() {
			return this.imageURL;
		}

		public void setImageURL(String imageURL) {
			this.imageURL = imageURL;
		}

		public Integer getMaxFrames() {
			return this.maxFrames;
		}

		public void setMaxFrames(Integer maxFrames) {
			this.maxFrames = maxFrames;
		}

		public Integer getInterval() {
			return this.interval;
		}

		public void setInterval(Integer interval) {
			this.interval = interval;
		}

		public Long getImageTimeMillisecond() {
			return this.imageTimeMillisecond;
		}

		public void setImageTimeMillisecond(Long imageTimeMillisecond) {
			this.imageTimeMillisecond = imageTimeMillisecond;
		}
	}

	@Override
	public Class<ScanImageResponse> getResponseClass() {
		return ScanImageResponse.class;
	}

}
