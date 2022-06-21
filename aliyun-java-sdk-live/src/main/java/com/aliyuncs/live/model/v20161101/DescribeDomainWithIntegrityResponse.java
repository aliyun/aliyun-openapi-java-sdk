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

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeDomainWithIntegrityResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainWithIntegrityResponse extends AcsResponse {

	private String requestId;

	private List<ContentItem> content;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ContentItem> getContent() {
		return this.content;
	}

	public void setContent(List<ContentItem> content) {
		this.content = content;
	}

	public static class ContentItem {

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
	public DescribeDomainWithIntegrityResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainWithIntegrityResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
