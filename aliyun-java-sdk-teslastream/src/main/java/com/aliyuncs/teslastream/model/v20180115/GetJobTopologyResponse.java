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

package com.aliyuncs.teslastream.model.v20180115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.teslastream.transform.v20180115.GetJobTopologyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetJobTopologyResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private List<Job> data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Job> getData() {
		return this.data;
	}

	public void setData(List<Job> data) {
		this.data = data;
	}

	public static class Job {

		private String text;

		private String type;

		private String pluginRelation;

		private List<String> parents;

		private List<String> childrens;

		public String getText() {
			return this.text;
		}

		public void setText(String text) {
			this.text = text;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getPluginRelation() {
			return this.pluginRelation;
		}

		public void setPluginRelation(String pluginRelation) {
			this.pluginRelation = pluginRelation;
		}

		public List<String> getParents() {
			return this.parents;
		}

		public void setParents(List<String> parents) {
			this.parents = parents;
		}

		public List<String> getChildrens() {
			return this.childrens;
		}

		public void setChildrens(List<String> childrens) {
			this.childrens = childrens;
		}
	}

	@Override
	public GetJobTopologyResponse getInstance(UnmarshallerContext context) {
		return	GetJobTopologyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
