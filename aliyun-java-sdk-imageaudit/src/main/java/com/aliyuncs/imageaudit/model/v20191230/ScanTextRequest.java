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
public class ScanTextRequest extends RpcAcsRequest<ScanTextResponse> {
	   

	private List<Labels> labelss;

	private List<Tasks> taskss;
	public ScanTextRequest() {
		super("imageaudit", "2019-12-30", "ScanText", "imageaudit");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Labels> getLabelss() {
		return this.labelss;
	}

	public void setLabelss(List<Labels> labelss) {
		this.labelss = labelss;	
		if (labelss != null) {
			for (int depth1 = 0; depth1 < labelss.size(); depth1++) {
				putBodyParameter("Labels." + (depth1 + 1) + ".Label" , labelss.get(depth1).getLabel());
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
				putBodyParameter("Tasks." + (depth1 + 1) + ".Content" , taskss.get(depth1).getContent());
			}
		}	
	}

	public static class Labels {

		private String label;

		public String getLabel() {
			return this.label;
		}

		public void setLabel(String label) {
			this.label = label;
		}
	}

	public static class Tasks {

		private String content;

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}
	}

	@Override
	public Class<ScanTextResponse> getResponseClass() {
		return ScanTextResponse.class;
	}

}
