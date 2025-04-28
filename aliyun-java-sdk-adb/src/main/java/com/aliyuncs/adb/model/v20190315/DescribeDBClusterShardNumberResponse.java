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
import com.aliyuncs.adb.transform.v20190315.DescribeDBClusterShardNumberResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBClusterShardNumberResponse extends AcsResponse {

	private String requestId;

	private Integer shardNumber;

	private List<AvailableShardNumberListItem> availableShardNumberList;

	private List<Integer> availableShardNumbers;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getShardNumber() {
		return this.shardNumber;
	}

	public void setShardNumber(Integer shardNumber) {
		this.shardNumber = shardNumber;
	}

	public List<AvailableShardNumberListItem> getAvailableShardNumberList() {
		return this.availableShardNumberList;
	}

	public void setAvailableShardNumberList(List<AvailableShardNumberListItem> availableShardNumberList) {
		this.availableShardNumberList = availableShardNumberList;
	}

	public List<Integer> getAvailableShardNumbers() {
		return this.availableShardNumbers;
	}

	public void setAvailableShardNumbers(List<Integer> availableShardNumbers) {
		this.availableShardNumbers = availableShardNumbers;
	}

	public static class AvailableShardNumberListItem {

		private Integer shardNumber;

		public Integer getShardNumber() {
			return this.shardNumber;
		}

		public void setShardNumber(Integer shardNumber) {
			this.shardNumber = shardNumber;
		}
	}

	@Override
	public DescribeDBClusterShardNumberResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBClusterShardNumberResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
