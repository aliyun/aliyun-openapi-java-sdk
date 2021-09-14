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

package com.aliyuncs.datav_outer.model.v20190402;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.datav_outer.transform.v20190402.ListTemplateByWorkspaceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTemplateByWorkspaceResponse extends AcsResponse {

	private String requestId;

	private List<TemplateInstance> templates;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<TemplateInstance> getTemplates() {
		return this.templates;
	}

	public void setTemplates(List<TemplateInstance> templates) {
		this.templates = templates;
	}

	public static class TemplateInstance {

		private Float iD;

		private String name;

		private String snapshot;

		private String thumbnail;

		private String size;

		public Float getID() {
			return this.iD;
		}

		public void setID(Float iD) {
			this.iD = iD;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSnapshot() {
			return this.snapshot;
		}

		public void setSnapshot(String snapshot) {
			this.snapshot = snapshot;
		}

		public String getThumbnail() {
			return this.thumbnail;
		}

		public void setThumbnail(String thumbnail) {
			this.thumbnail = thumbnail;
		}

		public String getSize() {
			return this.size;
		}

		public void setSize(String size) {
			this.size = size;
		}
	}

	@Override
	public ListTemplateByWorkspaceResponse getInstance(UnmarshallerContext context) {
		return	ListTemplateByWorkspaceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
