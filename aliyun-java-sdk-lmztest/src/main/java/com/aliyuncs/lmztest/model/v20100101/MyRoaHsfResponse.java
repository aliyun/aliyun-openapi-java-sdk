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

package com.aliyuncs.lmztest.model.v20100101;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.lmztest.transform.v20100101.MyRoaHsfResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class MyRoaHsfResponse extends AcsResponse {

	private String id;

	private String name;

	private List<Map<Object,Object>> infos;

	private AddCRParam addCRParam;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Map<Object,Object>> getInfos() {
		return this.infos;
	}

	public void setInfos(List<Map<Object,Object>> infos) {
		this.infos = infos;
	}

	public AddCRParam getAddCRParam() {
		return this.addCRParam;
	}

	public void setAddCRParam(AddCRParam addCRParam) {
		this.addCRParam = addCRParam;
	}

	public static class AddCRParam {

		private String attributes;

		private String configId;

		private List<String> relations;

		public String getAttributes() {
			return this.attributes;
		}

		public void setAttributes(String attributes) {
			this.attributes = attributes;
		}

		public String getConfigId() {
			return this.configId;
		}

		public void setConfigId(String configId) {
			this.configId = configId;
		}

		public List<String> getRelations() {
			return this.relations;
		}

		public void setRelations(List<String> relations) {
			this.relations = relations;
		}
	}

	@Override
	public MyRoaHsfResponse getInstance(UnmarshallerContext context) {
		return	MyRoaHsfResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
