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

package com.aliyuncs.mts.model.v20140618;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mts.transform.v20140618.ListFpShotDBResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFpShotDBResponse extends AcsResponse {

	private String requestId;

	private List<FpShotDB> fpShotDBList;

	private List<String> nonExistIds;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<FpShotDB> getFpShotDBList() {
		return this.fpShotDBList;
	}

	public void setFpShotDBList(List<FpShotDB> fpShotDBList) {
		this.fpShotDBList = fpShotDBList;
	}

	public List<String> getNonExistIds() {
		return this.nonExistIds;
	}

	public void setNonExistIds(List<String> nonExistIds) {
		this.nonExistIds = nonExistIds;
	}

	public static class FpShotDB {

		private String status;

		private String description;

		private String name;

		private Integer modelId;

		private String fpDBId;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getModelId() {
			return this.modelId;
		}

		public void setModelId(Integer modelId) {
			this.modelId = modelId;
		}

		public String getFpDBId() {
			return this.fpDBId;
		}

		public void setFpDBId(String fpDBId) {
			this.fpDBId = fpDBId;
		}
	}

	@Override
	public ListFpShotDBResponse getInstance(UnmarshallerContext context) {
		return	ListFpShotDBResponseUnmarshaller.unmarshall(this, context);
	}
}
