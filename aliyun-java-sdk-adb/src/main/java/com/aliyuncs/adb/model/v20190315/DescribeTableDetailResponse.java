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

package com.aliyuncs.adb.model.v20190315;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.adb.transform.v20190315.DescribeTableDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTableDetailResponse extends AcsResponse {

	private String requestId;

	private Long avgSize;

	private List<Shard> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getAvgSize() {
		return this.avgSize;
	}

	public void setAvgSize(Long avgSize) {
		this.avgSize = avgSize;
	}

	public List<Shard> getItems() {
		return this.items;
	}

	public void setItems(List<Shard> items) {
		this.items = items;
	}

	public static class Shard {

		private Integer id;

		private Long size;

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
		}
	}

	@Override
	public DescribeTableDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeTableDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
