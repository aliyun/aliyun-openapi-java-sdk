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

package com.aliyuncs.emas_dmp.model.v20210402;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emas_dmp.transform.v20210402.ListTargetAudienceTypeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTargetAudienceTypeResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<Type> typesList;

		public List<Type> getTypesList() {
			return this.typesList;
		}

		public void setTypesList(List<Type> typesList) {
			this.typesList = typesList;
		}

		public static class Type {

			private String name;

			private List<String> subTypes;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public List<String> getSubTypes() {
				return this.subTypes;
			}

			public void setSubTypes(List<String> subTypes) {
				this.subTypes = subTypes;
			}
		}
	}

	@Override
	public ListTargetAudienceTypeResponse getInstance(UnmarshallerContext context) {
		return	ListTargetAudienceTypeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
