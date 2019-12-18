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
	   

	private List<String> sceness;

	private List<Tasks> taskss;
	public ScanImageRequest() {
		super("imageaudit", "2019-12-30", "ScanImage", "imageaudit");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getSceness() {
		return this.sceness;
	}

	public void setSceness(List<String> sceness) {
		this.sceness = sceness;	
		if (sceness != null) {
			for (int i = 0; i < sceness.size(); i++) {
				putBodyParameter("Scenes." + (i + 1) , sceness.get(i));
			}
		}	
	}

	public List<Tasks> getTaskss() {
		return this.taskss;
	}

	public void setTaskss(List<Tasks> taskss) {
		this.taskss = taskss;	
		if (taskss != null) {
			for (int depth1 = 0; depth1 < taskss.size(); depth1++) {
				putBodyParameter("Tasks." + (depth1 + 1) + ".DataId" , taskss.get(depth1).getDataId());
				putBodyParameter("Tasks." + (depth1 + 1) + ".ImageURL" , taskss.get(depth1).getImageURL());
				putBodyParameter("Tasks." + (depth1 + 1) + ".MaxFrames" , taskss.get(depth1).getMaxFrames());
				putBodyParameter("Tasks." + (depth1 + 1) + ".Interval" , taskss.get(depth1).getInterval());
				putBodyParameter("Tasks." + (depth1 + 1) + ".ImageTimeMillisecond" , taskss.get(depth1).getImageTimeMillisecond());
			}
		}	
	}

	public static class Tasks {

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
