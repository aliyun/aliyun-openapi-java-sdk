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

package com.aliyuncs.rtc.model.v20180111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rtc.transform.v20180111.DescribeChannelUsersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeChannelUsersResponse extends AcsResponse {

	private String requestId;

	private Integer timestamp;

	private Boolean isChannelExist;

	private Integer channelProfile;

	private Integer commTotalNum;

	private Integer interactiveUserNum;

	private Integer liveUserNum;

	private List<String> userList;

	private List<String> interactiveUserList;

	private List<String> liveUserList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Integer timestamp) {
		this.timestamp = timestamp;
	}

	public Boolean getIsChannelExist() {
		return this.isChannelExist;
	}

	public void setIsChannelExist(Boolean isChannelExist) {
		this.isChannelExist = isChannelExist;
	}

	public Integer getChannelProfile() {
		return this.channelProfile;
	}

	public void setChannelProfile(Integer channelProfile) {
		this.channelProfile = channelProfile;
	}

	public Integer getCommTotalNum() {
		return this.commTotalNum;
	}

	public void setCommTotalNum(Integer commTotalNum) {
		this.commTotalNum = commTotalNum;
	}

	public Integer getInteractiveUserNum() {
		return this.interactiveUserNum;
	}

	public void setInteractiveUserNum(Integer interactiveUserNum) {
		this.interactiveUserNum = interactiveUserNum;
	}

	public Integer getLiveUserNum() {
		return this.liveUserNum;
	}

	public void setLiveUserNum(Integer liveUserNum) {
		this.liveUserNum = liveUserNum;
	}

	public List<String> getUserList() {
		return this.userList;
	}

	public void setUserList(List<String> userList) {
		this.userList = userList;
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
