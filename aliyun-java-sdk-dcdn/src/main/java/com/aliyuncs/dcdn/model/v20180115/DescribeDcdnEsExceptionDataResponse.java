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

package com.aliyuncs.dcdn.model.v20180115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dcdn.transform.v20180115.DescribeDcdnEsExceptionDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDcdnEsExceptionDataResponse extends AcsResponse {

	private String requestId;

	private List<Content> contents;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Content> getContents() {
		return this.contents;
	}

	public void setContents(List<Content> contents) {
		this.contents = contents;
	}

	public static class Content {

		private String name;

		private List<String> columns;

		private List<String> points;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<String> getColumns() {
			return this.columns;
		}

		public void setColumns(List<String> columns) {
			this.columns = columns;
		}

		public List<String> getPoints() {
			return this.points;
		}

		public void setPoints(List<String> points) {
			this.points = points;
		}
	}

	@Override
	public DescribeDcdnEsExceptionDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeDcdnEsExceptionDataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
