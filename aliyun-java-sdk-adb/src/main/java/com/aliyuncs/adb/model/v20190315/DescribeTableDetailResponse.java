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

	private Long avgSize;

	private String requestId;

	private List<Shard> items;

	public Long getAvgSize() {
		return this.avgSize;
	}

	public void setAvgSize(Long avgSize) {
		this.avgSize = avgSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Shard> getItems() {
		return this.items;
	}

	public void setItems(List<Shard> items) {
		this.items = items;
	}

	public static class Shard {

		private Long size;

		private Integer id;

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
		}

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}
	}

	@Override
	public DescribeTableDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeTableDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
