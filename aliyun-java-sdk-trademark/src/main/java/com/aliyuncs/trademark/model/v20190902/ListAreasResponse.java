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

package com.aliyuncs.trademark.model.v20190902;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.trademark.transform.v20190902.ListAreasResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAreasResponse extends AcsResponse {

	private String requestId;

	private List<Area> datas;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Area> getDatas() {
		return this.datas;
	}

	public void setDatas(List<Area> datas) {
		this.datas = datas;
	}

	public static class Area {

		private String code;

		private String parentCode;

		private String name;

		private Integer sortNum;

		private List<Area1> subArea;

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getParentCode() {
			return this.parentCode;
		}

		public void setParentCode(String parentCode) {
			this.parentCode = parentCode;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getSortNum() {
			return this.sortNum;
		}

		public void setSortNum(Integer sortNum) {
			this.sortNum = sortNum;
		}

		public List<Area1> getSubArea() {
			return this.subArea;
		}

		public void setSubArea(List<Area1> subArea) {
			this.subArea = subArea;
		}

		public static class Area1 {

			private String code;

			private String parentCode;

			private String name;

			private Integer sortNum;

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}

			public String getParentCode() {
				return this.parentCode;
			}

			public void setParentCode(String parentCode) {
				this.parentCode = parentCode;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Integer getSortNum() {
				return this.sortNum;
			}

			public void setSortNum(Integer sortNum) {
				this.sortNum = sortNum;
			}
		}
	}

	@Override
	public ListAreasResponse getInstance(UnmarshallerContext context) {
		return	ListAreasResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
