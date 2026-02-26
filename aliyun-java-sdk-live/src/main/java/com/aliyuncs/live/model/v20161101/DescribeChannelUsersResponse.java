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
import com.aliyuncs.live.transform.v20161101.DescribeChannelUsersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeChannelUsersResponse extends AcsResponse {

	private String requestId;

	private Long timestamp;

	private Boolean isChannelExists;

	private Integer interactiveUserNumber;

	private Integer liveUserNumber;

	private List<String> interactiveUserList;

	private List<String> liveUserList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public Boolean getIsChannelExists() {
		return this.isChannelExists;
	}

	public void setIsChannelExists(Boolean isChannelExists) {
		this.isChannelExists = isChannelExists;
	}

	public Integer getInteractiveUserNumber() {
		return this.interactiveUserNumber;
	}

	public void setInteractiveUserNumber(Integer interactiveUserNumber) {
		this.interactiveUserNumber = interactiveUserNumber;
	}

	public Integer getLiveUserNumber() {
		return this.liveUserNumber;
	}

	public void setLiveUserNumber(Integer liveUserNumber) {
		this.liveUserNumber = liveUserNumber;
	}

	public List<String> getInteractiveUserList() {
		return this.interactiveUserList;
	}

	public void setInteractiveUserList(List<String> interactiveUserList) {
		this.interactiveUserList = interactiveUserList;
	}

	public List<String> getLiveUserList() {
		return this.liveUserList;
	}

	public void setLiveUserList(List<String> liveUserList) {
		this.liveUserList = liveUserList;
	}

	@Override
	public DescribeChannelUsersResponse getInstance(UnmarshallerContext context) {
		return	DescribeChannelUsersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
