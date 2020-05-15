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

package com.aliyuncs.ess.model.v20140828;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeScheduledTasksRequest extends RpcAcsRequest<DescribeScheduledTasksResponse> {
	   

	private Long resourceOwnerId;

	private String scheduledAction2;

	private String scheduledAction1;

	private String scheduledAction6;

	private String scheduledAction5;

	private String scheduledAction4;

	private String scheduledAction3;

	private String scheduledAction9;

	private String scheduledAction8;

	private String scheduledAction7;

	private Long ownerId;

	private String scheduledTaskName20;

	private String scheduledTaskName19;

	private String scheduledTaskName18;

	private String scheduledTaskId20;

	private String scheduledTaskName13;

	private String scheduledTaskName12;

	private String scheduledTaskName11;

	private String scheduledTaskName10;

	private String scheduledTaskName17;

	private String scheduledTaskName16;

	private Integer pageNumber;

	private String scheduledTaskName15;

	private String scheduledTaskName14;

	private String scheduledTaskId2;

	private String scheduledTaskId1;

	private String scheduledTaskId4;

	private String scheduledTaskId18;

	private String scheduledTaskId3;

	private String scheduledTaskId19;

	private String scheduledTaskId6;

	private String scheduledTaskId5;

	private String scheduledTaskId8;

	private String scheduledTaskName9;

	private String scheduledAction20;

	private String scheduledTaskId7;

	private Integer pageSize;

	private String scheduledTaskId12;

	private String scheduledTaskName7;

	private String scheduledTaskId9;

	private String scheduledTaskId13;

	private String scheduledTaskName8;

	private String scheduledTaskId10;

	private String scheduledTaskName5;

	private String scheduledTaskId11;

	private String scheduledTaskName6;

	private String scheduledTaskId16;

	private String scheduledTaskName3;

	private String scheduledTaskId17;

	private String scheduledTaskName4;

	private String scheduledTaskId14;

	private String scheduledTaskName1;

	private String scheduledTaskId15;

	private String scheduledTaskName2;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String scheduledAction18;

	private String scheduledAction19;

	private String scheduledAction16;

	private String scheduledAction17;

	private String scheduledAction14;

	private String scheduledAction15;

	private String scheduledAction12;

	private String scheduledAction13;

	private String scheduledAction10;

	private String scheduledAction11;
	public DescribeScheduledTasksRequest() {
		super("Ess", "2014-08-28", "DescribeScheduledTasks", "ess");
		setMethod(MethodType.POST);
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getScheduledAction2() {
		return this.scheduledAction2;
	}

	public void setScheduledAction2(String scheduledAction2) {
		this.scheduledAction2 = scheduledAction2;
		if(scheduledAction2 != null){
			putQueryParameter("ScheduledAction.2", scheduledAction2);
		}
	}

	public String getScheduledAction1() {
		return this.scheduledAction1;
	}

	public void setScheduledAction1(String scheduledAction1) {
		this.scheduledAction1 = scheduledAction1;
		if(scheduledAction1 != null){
			putQueryParameter("ScheduledAction.1", scheduledAction1);
		}
	}

	public String getScheduledAction6() {
		return this.scheduledAction6;
	}

	public void setScheduledAction6(String scheduledAction6) {
		this.scheduledAction6 = scheduledAction6;
		if(scheduledAction6 != null){
			putQueryParameter("ScheduledAction.6", scheduledAction6);
		}
	}

	public String getScheduledAction5() {
		return this.scheduledAction5;
	}

	public void setScheduledAction5(String scheduledAction5) {
		this.scheduledAction5 = scheduledAction5;
		if(scheduledAction5 != null){
			putQueryParameter("ScheduledAction.5", scheduledAction5);
		}
	}

	public String getScheduledAction4() {
		return this.scheduledAction4;
	}

	public void setScheduledAction4(String scheduledAction4) {
		this.scheduledAction4 = scheduledAction4;
		if(scheduledAction4 != null){
			putQueryParameter("ScheduledAction.4", scheduledAction4);
		}
	}

	public String getScheduledAction3() {
		return this.scheduledAction3;
	}

	public void setScheduledAction3(String scheduledAction3) {
		this.scheduledAction3 = scheduledAction3;
		if(scheduledAction3 != null){
			putQueryParameter("ScheduledAction.3", scheduledAction3);
		}
	}

	public String getScheduledAction9() {
		return this.scheduledAction9;
	}

	public void setScheduledAction9(String scheduledAction9) {
		this.scheduledAction9 = scheduledAction9;
		if(scheduledAction9 != null){
			putQueryParameter("ScheduledAction.9", scheduledAction9);
		}
	}

	public String getScheduledAction8() {
		return this.scheduledAction8;
	}

	public void setScheduledAction8(String scheduledAction8) {
		this.scheduledAction8 = scheduledAction8;
		if(scheduledAction8 != null){
			putQueryParameter("ScheduledAction.8", scheduledAction8);
		}
	}

	public String getScheduledAction7() {
		return this.scheduledAction7;
	}

	public void setScheduledAction7(String scheduledAction7) {
		this.scheduledAction7 = scheduledAction7;
		if(scheduledAction7 != null){
			putQueryParameter("ScheduledAction.7", scheduledAction7);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getScheduledTaskName20() {
		return this.scheduledTaskName20;
	}

	public void setScheduledTaskName20(String scheduledTaskName20) {
		this.scheduledTaskName20 = scheduledTaskName20;
		if(scheduledTaskName20 != null){
			putQueryParameter("ScheduledTaskName.20", scheduledTaskName20);
		}
	}

	public String getScheduledTaskName19() {
		return this.scheduledTaskName19;
	}

	public void setScheduledTaskName19(String scheduledTaskName19) {
		this.scheduledTaskName19 = scheduledTaskName19;
		if(scheduledTaskName19 != null){
			putQueryParameter("ScheduledTaskName.19", scheduledTaskName19);
		}
	}

	public String getScheduledTaskName18() {
		return this.scheduledTaskName18;
	}

	public void setScheduledTaskName18(String scheduledTaskName18) {
		this.scheduledTaskName18 = scheduledTaskName18;
		if(scheduledTaskName18 != null){
			putQueryParameter("ScheduledTaskName.18", scheduledTaskName18);
		}
	}

	public String getScheduledTaskId20() {
		return this.scheduledTaskId20;
	}

	public void setScheduledTaskId20(String scheduledTaskId20) {
		this.scheduledTaskId20 = scheduledTaskId20;
		if(scheduledTaskId20 != null){
			putQueryParameter("ScheduledTaskId.20", scheduledTaskId20);
		}
	}

	public String getScheduledTaskName13() {
		return this.scheduledTaskName13;
	}

	public void setScheduledTaskName13(String scheduledTaskName13) {
		this.scheduledTaskName13 = scheduledTaskName13;
		if(scheduledTaskName13 != null){
			putQueryParameter("ScheduledTaskName.13", scheduledTaskName13);
		}
	}

	public String getScheduledTaskName12() {
		return this.scheduledTaskName12;
	}

	public void setScheduledTaskName12(String scheduledTaskName12) {
		this.scheduledTaskName12 = scheduledTaskName12;
		if(scheduledTaskName12 != null){
			putQueryParameter("ScheduledTaskName.12", scheduledTaskName12);
		}
	}

	public String getScheduledTaskName11() {
		return this.scheduledTaskName11;
	}

	public void setScheduledTaskName11(String scheduledTaskName11) {
		this.scheduledTaskName11 = scheduledTaskName11;
		if(scheduledTaskName11 != null){
			putQueryParameter("ScheduledTaskName.11", scheduledTaskName11);
		}
	}

	public String getScheduledTaskName10() {
		return this.scheduledTaskName10;
	}

	public void setScheduledTaskName10(String scheduledTaskName10) {
		this.scheduledTaskName10 = scheduledTaskName10;
		if(scheduledTaskName10 != null){
			putQueryParameter("ScheduledTaskName.10", scheduledTaskName10);
		}
	}

	public String getScheduledTaskName17() {
		return this.scheduledTaskName17;
	}

	public void setScheduledTaskName17(String scheduledTaskName17) {
		this.scheduledTaskName17 = scheduledTaskName17;
		if(scheduledTaskName17 != null){
			putQueryParameter("ScheduledTaskName.17", scheduledTaskName17);
		}
	}

	public String getScheduledTaskName16() {
		return this.scheduledTaskName16;
	}

	public void setScheduledTaskName16(String scheduledTaskName16) {
		this.scheduledTaskName16 = scheduledTaskName16;
		if(scheduledTaskName16 != null){
			putQueryParameter("ScheduledTaskName.16", scheduledTaskName16);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getScheduledTaskName15() {
		return this.scheduledTaskName15;
	}

	public void setScheduledTaskName15(String scheduledTaskName15) {
		this.scheduledTaskName15 = scheduledTaskName15;
		if(scheduledTaskName15 != null){
			putQueryParameter("ScheduledTaskName.15", scheduledTaskName15);
		}
	}

	public String getScheduledTaskName14() {
		return this.scheduledTaskName14;
	}

	public void setScheduledTaskName14(String scheduledTaskName14) {
		this.scheduledTaskName14 = scheduledTaskName14;
		if(scheduledTaskName14 != null){
			putQueryParameter("ScheduledTaskName.14", scheduledTaskName14);
		}
	}

	public String getScheduledTaskId2() {
		return this.scheduledTaskId2;
	}

	public void setScheduledTaskId2(String scheduledTaskId2) {
		this.scheduledTaskId2 = scheduledTaskId2;
		if(scheduledTaskId2 != null){
			putQueryParameter("ScheduledTaskId.2", scheduledTaskId2);
		}
	}

	public String getScheduledTaskId1() {
		return this.scheduledTaskId1;
	}

	public void setScheduledTaskId1(String scheduledTaskId1) {
		this.scheduledTaskId1 = scheduledTaskId1;
		if(scheduledTaskId1 != null){
			putQueryParameter("ScheduledTaskId.1", scheduledTaskId1);
		}
	}

	public String getScheduledTaskId4() {
		return this.scheduledTaskId4;
	}

	public void setScheduledTaskId4(String scheduledTaskId4) {
		this.scheduledTaskId4 = scheduledTaskId4;
		if(scheduledTaskId4 != null){
			putQueryParameter("ScheduledTaskId.4", scheduledTaskId4);
		}
	}

	public String getScheduledTaskId18() {
		return this.scheduledTaskId18;
	}

	public void setScheduledTaskId18(String scheduledTaskId18) {
		this.scheduledTaskId18 = scheduledTaskId18;
		if(scheduledTaskId18 != null){
			putQueryParameter("ScheduledTaskId.18", scheduledTaskId18);
		}
	}

	public String getScheduledTaskId3() {
		return this.scheduledTaskId3;
	}

	public void setScheduledTaskId3(String scheduledTaskId3) {
		this.scheduledTaskId3 = scheduledTaskId3;
		if(scheduledTaskId3 != null){
			putQueryParameter("ScheduledTaskId.3", scheduledTaskId3);
		}
	}

	public String getScheduledTaskId19() {
		return this.scheduledTaskId19;
	}

	public void setScheduledTaskId19(String scheduledTaskId19) {
		this.scheduledTaskId19 = scheduledTaskId19;
		if(scheduledTaskId19 != null){
			putQueryParameter("ScheduledTaskId.19", scheduledTaskId19);
		}
	}

	public String getScheduledTaskId6() {
		return this.scheduledTaskId6;
	}

	public void setScheduledTaskId6(String scheduledTaskId6) {
		this.scheduledTaskId6 = scheduledTaskId6;
		if(scheduledTaskId6 != null){
			putQueryParameter("ScheduledTaskId.6", scheduledTaskId6);
		}
	}

	public String getScheduledTaskId5() {
		return this.scheduledTaskId5;
	}

	public void setScheduledTaskId5(String scheduledTaskId5) {
		this.scheduledTaskId5 = scheduledTaskId5;
		if(scheduledTaskId5 != null){
			putQueryParameter("ScheduledTaskId.5", scheduledTaskId5);
		}
	}

	public String getScheduledTaskId8() {
		return this.scheduledTaskId8;
	}

	public void setScheduledTaskId8(String scheduledTaskId8) {
		this.scheduledTaskId8 = scheduledTaskId8;
		if(scheduledTaskId8 != null){
			putQueryParameter("ScheduledTaskId.8", scheduledTaskId8);
		}
	}

	public String getScheduledTaskName9() {
		return this.scheduledTaskName9;
	}

	public void setScheduledTaskName9(String scheduledTaskName9) {
		this.scheduledTaskName9 = scheduledTaskName9;
		if(scheduledTaskName9 != null){
			putQueryParameter("ScheduledTaskName.9", scheduledTaskName9);
		}
	}

	public String getScheduledAction20() {
		return this.scheduledAction20;
	}

	public void setScheduledAction20(String scheduledAction20) {
		this.scheduledAction20 = scheduledAction20;
		if(scheduledAction20 != null){
			putQueryParameter("ScheduledAction.20", scheduledAction20);
		}
	}

	public String getScheduledTaskId7() {
		return this.scheduledTaskId7;
	}

	public void setScheduledTaskId7(String scheduledTaskId7) {
		this.scheduledTaskId7 = scheduledTaskId7;
		if(scheduledTaskId7 != null){
			putQueryParameter("ScheduledTaskId.7", scheduledTaskId7);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getScheduledTaskId12() {
		return this.scheduledTaskId12;
	}

	public void setScheduledTaskId12(String scheduledTaskId12) {
		this.scheduledTaskId12 = scheduledTaskId12;
		if(scheduledTaskId12 != null){
			putQueryParameter("ScheduledTaskId.12", scheduledTaskId12);
		}
	}

	public String getScheduledTaskName7() {
		return this.scheduledTaskName7;
	}

	public void setScheduledTaskName7(String scheduledTaskName7) {
		this.scheduledTaskName7 = scheduledTaskName7;
		if(scheduledTaskName7 != null){
			putQueryParameter("ScheduledTaskName.7", scheduledTaskName7);
		}
	}

	public String getScheduledTaskId9() {
		return this.scheduledTaskId9;
	}

	public void setScheduledTaskId9(String scheduledTaskId9) {
		this.scheduledTaskId9 = scheduledTaskId9;
		if(scheduledTaskId9 != null){
			putQueryParameter("ScheduledTaskId.9", scheduledTaskId9);
		}
	}

	public String getScheduledTaskId13() {
		return this.scheduledTaskId13;
	}

	public void setScheduledTaskId13(String scheduledTaskId13) {
		this.scheduledTaskId13 = scheduledTaskId13;
		if(scheduledTaskId13 != null){
			putQueryParameter("ScheduledTaskId.13", scheduledTaskId13);
		}
	}

	public String getScheduledTaskName8() {
		return this.scheduledTaskName8;
	}

	public void setScheduledTaskName8(String scheduledTaskName8) {
		this.scheduledTaskName8 = scheduledTaskName8;
		if(scheduledTaskName8 != null){
			putQueryParameter("ScheduledTaskName.8", scheduledTaskName8);
		}
	}

	public String getScheduledTaskId10() {
		return this.scheduledTaskId10;
	}

	public void setScheduledTaskId10(String scheduledTaskId10) {
		this.scheduledTaskId10 = scheduledTaskId10;
		if(scheduledTaskId10 != null){
			putQueryParameter("ScheduledTaskId.10", scheduledTaskId10);
		}
	}

	public String getScheduledTaskName5() {
		return this.scheduledTaskName5;
	}

	public void setScheduledTaskName5(String scheduledTaskName5) {
		this.scheduledTaskName5 = scheduledTaskName5;
		if(scheduledTaskName5 != null){
			putQueryParameter("ScheduledTaskName.5", scheduledTaskName5);
		}
	}

	public String getScheduledTaskId11() {
		return this.scheduledTaskId11;
	}

	public void setScheduledTaskId11(String scheduledTaskId11) {
		this.scheduledTaskId11 = scheduledTaskId11;
		if(scheduledTaskId11 != null){
			putQueryParameter("ScheduledTaskId.11", scheduledTaskId11);
		}
	}

	public String getScheduledTaskName6() {
		return this.scheduledTaskName6;
	}

	public void setScheduledTaskName6(String scheduledTaskName6) {
		this.scheduledTaskName6 = scheduledTaskName6;
		if(scheduledTaskName6 != null){
			putQueryParameter("ScheduledTaskName.6", scheduledTaskName6);
		}
	}

	public String getScheduledTaskId16() {
		return this.scheduledTaskId16;
	}

	public void setScheduledTaskId16(String scheduledTaskId16) {
		this.scheduledTaskId16 = scheduledTaskId16;
		if(scheduledTaskId16 != null){
			putQueryParameter("ScheduledTaskId.16", scheduledTaskId16);
		}
	}

	public String getScheduledTaskName3() {
		return this.scheduledTaskName3;
	}

	public void setScheduledTaskName3(String scheduledTaskName3) {
		this.scheduledTaskName3 = scheduledTaskName3;
		if(scheduledTaskName3 != null){
			putQueryParameter("ScheduledTaskName.3", scheduledTaskName3);
		}
	}

	public String getScheduledTaskId17() {
		return this.scheduledTaskId17;
	}

	public void setScheduledTaskId17(String scheduledTaskId17) {
		this.scheduledTaskId17 = scheduledTaskId17;
		if(scheduledTaskId17 != null){
			putQueryParameter("ScheduledTaskId.17", scheduledTaskId17);
		}
	}

	public String getScheduledTaskName4() {
		return this.scheduledTaskName4;
	}

	public void setScheduledTaskName4(String scheduledTaskName4) {
		this.scheduledTaskName4 = scheduledTaskName4;
		if(scheduledTaskName4 != null){
			putQueryParameter("ScheduledTaskName.4", scheduledTaskName4);
		}
	}

	public String getScheduledTaskId14() {
		return this.scheduledTaskId14;
	}

	public void setScheduledTaskId14(String scheduledTaskId14) {
		this.scheduledTaskId14 = scheduledTaskId14;
		if(scheduledTaskId14 != null){
			putQueryParameter("ScheduledTaskId.14", scheduledTaskId14);
		}
	}

	public String getScheduledTaskName1() {
		return this.scheduledTaskName1;
	}

	public void setScheduledTaskName1(String scheduledTaskName1) {
		this.scheduledTaskName1 = scheduledTaskName1;
		if(scheduledTaskName1 != null){
			putQueryParameter("ScheduledTaskName.1", scheduledTaskName1);
		}
	}

	public String getScheduledTaskId15() {
		return this.scheduledTaskId15;
	}

	public void setScheduledTaskId15(String scheduledTaskId15) {
		this.scheduledTaskId15 = scheduledTaskId15;
		if(scheduledTaskId15 != null){
			putQueryParameter("ScheduledTaskId.15", scheduledTaskId15);
		}
	}

	public String getScheduledTaskName2() {
		return this.scheduledTaskName2;
	}

	public void setScheduledTaskName2(String scheduledTaskName2) {
		this.scheduledTaskName2 = scheduledTaskName2;
		if(scheduledTaskName2 != null){
			putQueryParameter("ScheduledTaskName.2", scheduledTaskName2);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getScheduledAction18() {
		return this.scheduledAction18;
	}

	public void setScheduledAction18(String scheduledAction18) {
		this.scheduledAction18 = scheduledAction18;
		if(scheduledAction18 != null){
			putQueryParameter("ScheduledAction.18", scheduledAction18);
		}
	}

	public String getScheduledAction19() {
		return this.scheduledAction19;
	}

	public void setScheduledAction19(String scheduledAction19) {
		this.scheduledAction19 = scheduledAction19;
		if(scheduledAction19 != null){
			putQueryParameter("ScheduledAction.19", scheduledAction19);
		}
	}

	public String getScheduledAction16() {
		return this.scheduledAction16;
	}

	public void setScheduledAction16(String scheduledAction16) {
		this.scheduledAction16 = scheduledAction16;
		if(scheduledAction16 != null){
			putQueryParameter("ScheduledAction.16", scheduledAction16);
		}
	}

	public String getScheduledAction17() {
		return this.scheduledAction17;
	}

	public void setScheduledAction17(String scheduledAction17) {
		this.scheduledAction17 = scheduledAction17;
		if(scheduledAction17 != null){
			putQueryParameter("ScheduledAction.17", scheduledAction17);
		}
	}

	public String getScheduledAction14() {
		return this.scheduledAction14;
	}

	public void setScheduledAction14(String scheduledAction14) {
		this.scheduledAction14 = scheduledAction14;
		if(scheduledAction14 != null){
			putQueryParameter("ScheduledAction.14", scheduledAction14);
		}
	}

	public String getScheduledAction15() {
		return this.scheduledAction15;
	}

	public void setScheduledAction15(String scheduledAction15) {
		this.scheduledAction15 = scheduledAction15;
		if(scheduledAction15 != null){
			putQueryParameter("ScheduledAction.15", scheduledAction15);
		}
	}

	public String getScheduledAction12() {
		return this.scheduledAction12;
	}

	public void setScheduledAction12(String scheduledAction12) {
		this.scheduledAction12 = scheduledAction12;
		if(scheduledAction12 != null){
			putQueryParameter("ScheduledAction.12", scheduledAction12);
		}
	}

	public String getScheduledAction13() {
		return this.scheduledAction13;
	}

	public void setScheduledAction13(String scheduledAction13) {
		this.scheduledAction13 = scheduledAction13;
		if(scheduledAction13 != null){
			putQueryParameter("ScheduledAction.13", scheduledAction13);
		}
	}

	public String getScheduledAction10() {
		return this.scheduledAction10;
	}

	public void setScheduledAction10(String scheduledAction10) {
		this.scheduledAction10 = scheduledAction10;
		if(scheduledAction10 != null){
			putQueryParameter("ScheduledAction.10", scheduledAction10);
		}
	}

	public String getScheduledAction11() {
		return this.scheduledAction11;
	}

	public void setScheduledAction11(String scheduledAction11) {
		this.scheduledAction11 = scheduledAction11;
		if(scheduledAction11 != null){
			putQueryParameter("ScheduledAction.11", scheduledAction11);
		}
	}

	@Override
	public Class<DescribeScheduledTasksResponse> getResponseClass() {
		return DescribeScheduledTasksResponse.class;
	}

}
