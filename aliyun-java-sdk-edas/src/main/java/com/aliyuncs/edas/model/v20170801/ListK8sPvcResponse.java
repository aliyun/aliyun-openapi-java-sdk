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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.edas.transform.v20170801.ListK8sPvcResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListK8sPvcResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private List<K8sPvcListItem> k8sPvcList;

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

	public List<K8sPvcListItem> getK8sPvcList() {
		return this.k8sPvcList;
	}

	public void setK8sPvcList(List<K8sPvcListItem> k8sPvcList) {
		this.k8sPvcList = k8sPvcList;
	}

	public static class K8sPvcListItem {

		private String name;

		private String namespace;

		private String creationTime;

		private String volumeName;

		private String volumeMode;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getVolumeName() {
			return this.volumeName;
		}

		public void setVolumeName(String volumeName) {
			this.volumeName = volumeName;
		}

		public String getVolumeMode() {
			return this.volumeMode;
		}

		public void setVolumeMode(String volumeMode) {
			this.volumeMode = volumeMode;
		}
	}

	@Override
	public ListK8sPvcResponse getInstance(UnmarshallerContext context) {
		return	ListK8sPvcResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
