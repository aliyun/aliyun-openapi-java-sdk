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

package com.aliyuncs.r_kvstore.model.v20150101;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class TagResourcesRequest extends RpcAcsRequest<TagResourcesResponse> {
	
	public TagResourcesRequest() {
		super("R-kvstore", "2015-01-01", "TagResources", "redisa");
	}

	private String resourceId47;

	private String resourceId48;

	private String resourceId49;

	private String tag2Key;

	private String tag12Value;

	private String resourceId40;

	private String resourceId41;

	private String resourceId42;

	private String resourceId1;

	private String resourceId43;

	private String resourceId2;

	private String resourceId44;

	private String resourceId3;

	private String resourceId45;

	private String resourceId4;

	private String resourceId46;

	private String resourceId5;

	private String resourceId6;

	private String resourceId7;

	private String resourceId8;

	private String resourceId9;

	private String tag15Value;

	private String tag18Key;

	private String tag8Value;

	private String tag18Value;

	private String resourceId36;

	private String resourceId37;

	private String resourceId38;

	private String resourceId39;

	private String resourceId30;

	private String resourceId31;

	private Long ownerId;

	private String resourceId32;

	private String resourceId33;

	private String resourceId34;

	private String resourceId35;

	private String tag16Key;

	private String tag4Key;

	private String resourceId25;

	private String resourceId26;

	private String resourceId27;

	private String resourceId28;

	private String resourceId29;

	private String tag7Key;

	private String tag12Key;

	private String tag6Value;

	private String resourceId20;

	private String resourceId21;

	private String resourceId22;

	private String resourceId23;

	private String resourceId24;

	private String tag14Key;

	private String tag13Value;

	private String resourceId14;

	private String resourceId15;

	private String tag10Key;

	private String resourceId16;

	private String resourceId17;

	private String resourceId18;

	private String resourceOwnerAccount;

	private String resourceId19;

	private String tag19Key;

	private String resourceId10;

	private String resourceType;

	private String resourceId11;

	private String tag5Value;

	private String resourceId12;

	private String resourceId13;

	private String tag9Key;

	private String tag19Value;

	private String tag4Value;

	private Long resourceOwnerId;

	private String tag17Key;

	private String tag3Key;

	private String tag1Value;

	private String securityToken;

	private String tag15Key;

	private String tag11Value;

	private String tag5Key;

	private String tag14Value;

	private String tag7Value;

	private String tag20Key;

	private String tag20Value;

	private String tag17Value;

	private String tag13Key;

	private String tag9Value;

	private String tag6Key;

	private String tag10Value;

	private String tag3Value;

	private String ownerAccount;

	private String resourceId50;

	private String tag16Value;

	private String tag1Key;

	private String tag8Key;

	private String tag11Key;

	private String tag2Value;

	public String getResourceId47() {
		return this.resourceId47;
	}

	public void setResourceId47(String resourceId47) {
		this.resourceId47 = resourceId47;
		if(resourceId47 != null){
			putQueryParameter("ResourceId.47", resourceId47);
		}
	}

	public String getResourceId48() {
		return this.resourceId48;
	}

	public void setResourceId48(String resourceId48) {
		this.resourceId48 = resourceId48;
		if(resourceId48 != null){
			putQueryParameter("ResourceId.48", resourceId48);
		}
	}

	public String getResourceId49() {
		return this.resourceId49;
	}

	public void setResourceId49(String resourceId49) {
		this.resourceId49 = resourceId49;
		if(resourceId49 != null){
			putQueryParameter("ResourceId.49", resourceId49);
		}
	}

	public String getTag2Key() {
		return this.tag2Key;
	}

	public void setTag2Key(String tag2Key) {
		this.tag2Key = tag2Key;
		if(tag2Key != null){
			putQueryParameter("Tag.2.Key", tag2Key);
		}
	}

	public String getTag12Value() {
		return this.tag12Value;
	}

	public void setTag12Value(String tag12Value) {
		this.tag12Value = tag12Value;
		if(tag12Value != null){
			putQueryParameter("Tag.12.Value", tag12Value);
		}
	}

	public String getResourceId40() {
		return this.resourceId40;
	}

	public void setResourceId40(String resourceId40) {
		this.resourceId40 = resourceId40;
		if(resourceId40 != null){
			putQueryParameter("ResourceId.40", resourceId40);
		}
	}

	public String getResourceId41() {
		return this.resourceId41;
	}

	public void setResourceId41(String resourceId41) {
		this.resourceId41 = resourceId41;
		if(resourceId41 != null){
			putQueryParameter("ResourceId.41", resourceId41);
		}
	}

	public String getResourceId42() {
		return this.resourceId42;
	}

	public void setResourceId42(String resourceId42) {
		this.resourceId42 = resourceId42;
		if(resourceId42 != null){
			putQueryParameter("ResourceId.42", resourceId42);
		}
	}

	public String getResourceId1() {
		return this.resourceId1;
	}

	public void setResourceId1(String resourceId1) {
		this.resourceId1 = resourceId1;
		if(resourceId1 != null){
			putQueryParameter("ResourceId.1", resourceId1);
		}
	}

	public String getResourceId43() {
		return this.resourceId43;
	}

	public void setResourceId43(String resourceId43) {
		this.resourceId43 = resourceId43;
		if(resourceId43 != null){
			putQueryParameter("ResourceId.43", resourceId43);
		}
	}

	public String getResourceId2() {
		return this.resourceId2;
	}

	public void setResourceId2(String resourceId2) {
		this.resourceId2 = resourceId2;
		if(resourceId2 != null){
			putQueryParameter("ResourceId.2", resourceId2);
		}
	}

	public String getResourceId44() {
		return this.resourceId44;
	}

	public void setResourceId44(String resourceId44) {
		this.resourceId44 = resourceId44;
		if(resourceId44 != null){
			putQueryParameter("ResourceId.44", resourceId44);
		}
	}

	public String getResourceId3() {
		return this.resourceId3;
	}

	public void setResourceId3(String resourceId3) {
		this.resourceId3 = resourceId3;
		if(resourceId3 != null){
			putQueryParameter("ResourceId.3", resourceId3);
		}
	}

	public String getResourceId45() {
		return this.resourceId45;
	}

	public void setResourceId45(String resourceId45) {
		this.resourceId45 = resourceId45;
		if(resourceId45 != null){
			putQueryParameter("ResourceId.45", resourceId45);
		}
	}

	public String getResourceId4() {
		return this.resourceId4;
	}

	public void setResourceId4(String resourceId4) {
		this.resourceId4 = resourceId4;
		if(resourceId4 != null){
			putQueryParameter("ResourceId.4", resourceId4);
		}
	}

	public String getResourceId46() {
		return this.resourceId46;
	}

	public void setResourceId46(String resourceId46) {
		this.resourceId46 = resourceId46;
		if(resourceId46 != null){
			putQueryParameter("ResourceId.46", resourceId46);
		}
	}

	public String getResourceId5() {
		return this.resourceId5;
	}

	public void setResourceId5(String resourceId5) {
		this.resourceId5 = resourceId5;
		if(resourceId5 != null){
			putQueryParameter("ResourceId.5", resourceId5);
		}
	}

	public String getResourceId6() {
		return this.resourceId6;
	}

	public void setResourceId6(String resourceId6) {
		this.resourceId6 = resourceId6;
		if(resourceId6 != null){
			putQueryParameter("ResourceId.6", resourceId6);
		}
	}

	public String getResourceId7() {
		return this.resourceId7;
	}

	public void setResourceId7(String resourceId7) {
		this.resourceId7 = resourceId7;
		if(resourceId7 != null){
			putQueryParameter("ResourceId.7", resourceId7);
		}
	}

	public String getResourceId8() {
		return this.resourceId8;
	}

	public void setResourceId8(String resourceId8) {
		this.resourceId8 = resourceId8;
		if(resourceId8 != null){
			putQueryParameter("ResourceId.8", resourceId8);
		}
	}

	public String getResourceId9() {
		return this.resourceId9;
	}

	public void setResourceId9(String resourceId9) {
		this.resourceId9 = resourceId9;
		if(resourceId9 != null){
			putQueryParameter("ResourceId.9", resourceId9);
		}
	}

	public String getTag15Value() {
		return this.tag15Value;
	}

	public void setTag15Value(String tag15Value) {
		this.tag15Value = tag15Value;
		if(tag15Value != null){
			putQueryParameter("Tag.15.Value", tag15Value);
		}
	}

	public String getTag18Key() {
		return this.tag18Key;
	}

	public void setTag18Key(String tag18Key) {
		this.tag18Key = tag18Key;
		if(tag18Key != null){
			putQueryParameter("Tag.18.Key", tag18Key);
		}
	}

	public String getTag8Value() {
		return this.tag8Value;
	}

	public void setTag8Value(String tag8Value) {
		this.tag8Value = tag8Value;
		if(tag8Value != null){
			putQueryParameter("Tag.8.Value", tag8Value);
		}
	}

	public String getTag18Value() {
		return this.tag18Value;
	}

	public void setTag18Value(String tag18Value) {
		this.tag18Value = tag18Value;
		if(tag18Value != null){
			putQueryParameter("Tag.18.Value", tag18Value);
		}
	}

	public String getResourceId36() {
		return this.resourceId36;
	}

	public void setResourceId36(String resourceId36) {
		this.resourceId36 = resourceId36;
		if(resourceId36 != null){
			putQueryParameter("ResourceId.36", resourceId36);
		}
	}

	public String getResourceId37() {
		return this.resourceId37;
	}

	public void setResourceId37(String resourceId37) {
		this.resourceId37 = resourceId37;
		if(resourceId37 != null){
			putQueryParameter("ResourceId.37", resourceId37);
		}
	}

	public String getResourceId38() {
		return this.resourceId38;
	}

	public void setResourceId38(String resourceId38) {
		this.resourceId38 = resourceId38;
		if(resourceId38 != null){
			putQueryParameter("ResourceId.38", resourceId38);
		}
	}

	public String getResourceId39() {
		return this.resourceId39;
	}

	public void setResourceId39(String resourceId39) {
		this.resourceId39 = resourceId39;
		if(resourceId39 != null){
			putQueryParameter("ResourceId.39", resourceId39);
		}
	}

	public String getResourceId30() {
		return this.resourceId30;
	}

	public void setResourceId30(String resourceId30) {
		this.resourceId30 = resourceId30;
		if(resourceId30 != null){
			putQueryParameter("ResourceId.30", resourceId30);
		}
	}

	public String getResourceId31() {
		return this.resourceId31;
	}

	public void setResourceId31(String resourceId31) {
		this.resourceId31 = resourceId31;
		if(resourceId31 != null){
			putQueryParameter("ResourceId.31", resourceId31);
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

	public String getResourceId32() {
		return this.resourceId32;
	}

	public void setResourceId32(String resourceId32) {
		this.resourceId32 = resourceId32;
		if(resourceId32 != null){
			putQueryParameter("ResourceId.32", resourceId32);
		}
	}

	public String getResourceId33() {
		return this.resourceId33;
	}

	public void setResourceId33(String resourceId33) {
		this.resourceId33 = resourceId33;
		if(resourceId33 != null){
			putQueryParameter("ResourceId.33", resourceId33);
		}
	}

	public String getResourceId34() {
		return this.resourceId34;
	}

	public void setResourceId34(String resourceId34) {
		this.resourceId34 = resourceId34;
		if(resourceId34 != null){
			putQueryParameter("ResourceId.34", resourceId34);
		}
	}

	public String getResourceId35() {
		return this.resourceId35;
	}

	public void setResourceId35(String resourceId35) {
		this.resourceId35 = resourceId35;
		if(resourceId35 != null){
			putQueryParameter("ResourceId.35", resourceId35);
		}
	}

	public String getTag16Key() {
		return this.tag16Key;
	}

	public void setTag16Key(String tag16Key) {
		this.tag16Key = tag16Key;
		if(tag16Key != null){
			putQueryParameter("Tag.16.Key", tag16Key);
		}
	}

	public String getTag4Key() {
		return this.tag4Key;
	}

	public void setTag4Key(String tag4Key) {
		this.tag4Key = tag4Key;
		if(tag4Key != null){
			putQueryParameter("Tag.4.Key", tag4Key);
		}
	}

	public String getResourceId25() {
		return this.resourceId25;
	}

	public void setResourceId25(String resourceId25) {
		this.resourceId25 = resourceId25;
		if(resourceId25 != null){
			putQueryParameter("ResourceId.25", resourceId25);
		}
	}

	public String getResourceId26() {
		return this.resourceId26;
	}

	public void setResourceId26(String resourceId26) {
		this.resourceId26 = resourceId26;
		if(resourceId26 != null){
			putQueryParameter("ResourceId.26", resourceId26);
		}
	}

	public String getResourceId27() {
		return this.resourceId27;
	}

	public void setResourceId27(String resourceId27) {
		this.resourceId27 = resourceId27;
		if(resourceId27 != null){
			putQueryParameter("ResourceId.27", resourceId27);
		}
	}

	public String getResourceId28() {
		return this.resourceId28;
	}

	public void setResourceId28(String resourceId28) {
		this.resourceId28 = resourceId28;
		if(resourceId28 != null){
			putQueryParameter("ResourceId.28", resourceId28);
		}
	}

	public String getResourceId29() {
		return this.resourceId29;
	}

	public void setResourceId29(String resourceId29) {
		this.resourceId29 = resourceId29;
		if(resourceId29 != null){
			putQueryParameter("ResourceId.29", resourceId29);
		}
	}

	public String getTag7Key() {
		return this.tag7Key;
	}

	public void setTag7Key(String tag7Key) {
		this.tag7Key = tag7Key;
		if(tag7Key != null){
			putQueryParameter("Tag.7.Key", tag7Key);
		}
	}

	public String getTag12Key() {
		return this.tag12Key;
	}

	public void setTag12Key(String tag12Key) {
		this.tag12Key = tag12Key;
		if(tag12Key != null){
			putQueryParameter("Tag.12.Key", tag12Key);
		}
	}

	public String getTag6Value() {
		return this.tag6Value;
	}

	public void setTag6Value(String tag6Value) {
		this.tag6Value = tag6Value;
		if(tag6Value != null){
			putQueryParameter("Tag.6.Value", tag6Value);
		}
	}

	public String getResourceId20() {
		return this.resourceId20;
	}

	public void setResourceId20(String resourceId20) {
		this.resourceId20 = resourceId20;
		if(resourceId20 != null){
			putQueryParameter("ResourceId.20", resourceId20);
		}
	}

	public String getResourceId21() {
		return this.resourceId21;
	}

	public void setResourceId21(String resourceId21) {
		this.resourceId21 = resourceId21;
		if(resourceId21 != null){
			putQueryParameter("ResourceId.21", resourceId21);
		}
	}

	public String getResourceId22() {
		return this.resourceId22;
	}

	public void setResourceId22(String resourceId22) {
		this.resourceId22 = resourceId22;
		if(resourceId22 != null){
			putQueryParameter("ResourceId.22", resourceId22);
		}
	}

	public String getResourceId23() {
		return this.resourceId23;
	}

	public void setResourceId23(String resourceId23) {
		this.resourceId23 = resourceId23;
		if(resourceId23 != null){
			putQueryParameter("ResourceId.23", resourceId23);
		}
	}

	public String getResourceId24() {
		return this.resourceId24;
	}

	public void setResourceId24(String resourceId24) {
		this.resourceId24 = resourceId24;
		if(resourceId24 != null){
			putQueryParameter("ResourceId.24", resourceId24);
		}
	}

	public String getTag14Key() {
		return this.tag14Key;
	}

	public void setTag14Key(String tag14Key) {
		this.tag14Key = tag14Key;
		if(tag14Key != null){
			putQueryParameter("Tag.14.Key", tag14Key);
		}
	}

	public String getTag13Value() {
		return this.tag13Value;
	}

	public void setTag13Value(String tag13Value) {
		this.tag13Value = tag13Value;
		if(tag13Value != null){
			putQueryParameter("Tag.13.Value", tag13Value);
		}
	}

	public String getResourceId14() {
		return this.resourceId14;
	}

	public void setResourceId14(String resourceId14) {
		this.resourceId14 = resourceId14;
		if(resourceId14 != null){
			putQueryParameter("ResourceId.14", resourceId14);
		}
	}

	public String getResourceId15() {
		return this.resourceId15;
	}

	public void setResourceId15(String resourceId15) {
		this.resourceId15 = resourceId15;
		if(resourceId15 != null){
			putQueryParameter("ResourceId.15", resourceId15);
		}
	}

	public String getTag10Key() {
		return this.tag10Key;
	}

	public void setTag10Key(String tag10Key) {
		this.tag10Key = tag10Key;
		if(tag10Key != null){
			putQueryParameter("Tag.10.Key", tag10Key);
		}
	}

	public String getResourceId16() {
		return this.resourceId16;
	}

	public void setResourceId16(String resourceId16) {
		this.resourceId16 = resourceId16;
		if(resourceId16 != null){
			putQueryParameter("ResourceId.16", resourceId16);
		}
	}

	public String getResourceId17() {
		return this.resourceId17;
	}

	public void setResourceId17(String resourceId17) {
		this.resourceId17 = resourceId17;
		if(resourceId17 != null){
			putQueryParameter("ResourceId.17", resourceId17);
		}
	}

	public String getResourceId18() {
		return this.resourceId18;
	}

	public void setResourceId18(String resourceId18) {
		this.resourceId18 = resourceId18;
		if(resourceId18 != null){
			putQueryParameter("ResourceId.18", resourceId18);
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

	public String getResourceId19() {
		return this.resourceId19;
	}

	public void setResourceId19(String resourceId19) {
		this.resourceId19 = resourceId19;
		if(resourceId19 != null){
			putQueryParameter("ResourceId.19", resourceId19);
		}
	}

	public String getTag19Key() {
		return this.tag19Key;
	}

	public void setTag19Key(String tag19Key) {
		this.tag19Key = tag19Key;
		if(tag19Key != null){
			putQueryParameter("Tag.19.Key", tag19Key);
		}
	}

	public String getResourceId10() {
		return this.resourceId10;
	}

	public void setResourceId10(String resourceId10) {
		this.resourceId10 = resourceId10;
		if(resourceId10 != null){
			putQueryParameter("ResourceId.10", resourceId10);
		}
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType);
		}
	}

	public String getResourceId11() {
		return this.resourceId11;
	}

	public void setResourceId11(String resourceId11) {
		this.resourceId11 = resourceId11;
		if(resourceId11 != null){
			putQueryParameter("ResourceId.11", resourceId11);
		}
	}

	public String getTag5Value() {
		return this.tag5Value;
	}

	public void setTag5Value(String tag5Value) {
		this.tag5Value = tag5Value;
		if(tag5Value != null){
			putQueryParameter("Tag.5.Value", tag5Value);
		}
	}

	public String getResourceId12() {
		return this.resourceId12;
	}

	public void setResourceId12(String resourceId12) {
		this.resourceId12 = resourceId12;
		if(resourceId12 != null){
			putQueryParameter("ResourceId.12", resourceId12);
		}
	}

	public String getResourceId13() {
		return this.resourceId13;
	}

	public void setResourceId13(String resourceId13) {
		this.resourceId13 = resourceId13;
		if(resourceId13 != null){
			putQueryParameter("ResourceId.13", resourceId13);
		}
	}

	public String getTag9Key() {
		return this.tag9Key;
	}

	public void setTag9Key(String tag9Key) {
		this.tag9Key = tag9Key;
		if(tag9Key != null){
			putQueryParameter("Tag.9.Key", tag9Key);
		}
	}

	public String getTag19Value() {
		return this.tag19Value;
	}

	public void setTag19Value(String tag19Value) {
		this.tag19Value = tag19Value;
		if(tag19Value != null){
			putQueryParameter("Tag.19.Value", tag19Value);
		}
	}

	public String getTag4Value() {
		return this.tag4Value;
	}

	public void setTag4Value(String tag4Value) {
		this.tag4Value = tag4Value;
		if(tag4Value != null){
			putQueryParameter("Tag.4.Value", tag4Value);
		}
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

	public String getTag17Key() {
		return this.tag17Key;
	}

	public void setTag17Key(String tag17Key) {
		this.tag17Key = tag17Key;
		if(tag17Key != null){
			putQueryParameter("Tag.17.Key", tag17Key);
		}
	}

	public String getTag3Key() {
		return this.tag3Key;
	}

	public void setTag3Key(String tag3Key) {
		this.tag3Key = tag3Key;
		if(tag3Key != null){
			putQueryParameter("Tag.3.Key", tag3Key);
		}
	}

	public String getTag1Value() {
		return this.tag1Value;
	}

	public void setTag1Value(String tag1Value) {
		this.tag1Value = tag1Value;
		if(tag1Value != null){
			putQueryParameter("Tag.1.Value", tag1Value);
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public String getTag15Key() {
		return this.tag15Key;
	}

	public void setTag15Key(String tag15Key) {
		this.tag15Key = tag15Key;
		if(tag15Key != null){
			putQueryParameter("Tag.15.Key", tag15Key);
		}
	}

	public String getTag11Value() {
		return this.tag11Value;
	}

	public void setTag11Value(String tag11Value) {
		this.tag11Value = tag11Value;
		if(tag11Value != null){
			putQueryParameter("Tag.11.Value", tag11Value);
		}
	}

	public String getTag5Key() {
		return this.tag5Key;
	}

	public void setTag5Key(String tag5Key) {
		this.tag5Key = tag5Key;
		if(tag5Key != null){
			putQueryParameter("Tag.5.Key", tag5Key);
		}
	}

	public String getTag14Value() {
		return this.tag14Value;
	}

	public void setTag14Value(String tag14Value) {
		this.tag14Value = tag14Value;
		if(tag14Value != null){
			putQueryParameter("Tag.14.Value", tag14Value);
		}
	}

	public String getTag7Value() {
		return this.tag7Value;
	}

	public void setTag7Value(String tag7Value) {
		this.tag7Value = tag7Value;
		if(tag7Value != null){
			putQueryParameter("Tag.7.Value", tag7Value);
		}
	}

	public String getTag20Key() {
		return this.tag20Key;
	}

	public void setTag20Key(String tag20Key) {
		this.tag20Key = tag20Key;
		if(tag20Key != null){
			putQueryParameter("Tag.20.Key", tag20Key);
		}
	}

	public String getTag20Value() {
		return this.tag20Value;
	}

	public void setTag20Value(String tag20Value) {
		this.tag20Value = tag20Value;
		if(tag20Value != null){
			putQueryParameter("Tag.20.Value", tag20Value);
		}
	}

	public String getTag17Value() {
		return this.tag17Value;
	}

	public void setTag17Value(String tag17Value) {
		this.tag17Value = tag17Value;
		if(tag17Value != null){
			putQueryParameter("Tag.17.Value", tag17Value);
		}
	}

	public String getTag13Key() {
		return this.tag13Key;
	}

	public void setTag13Key(String tag13Key) {
		this.tag13Key = tag13Key;
		if(tag13Key != null){
			putQueryParameter("Tag.13.Key", tag13Key);
		}
	}

	public String getTag9Value() {
		return this.tag9Value;
	}

	public void setTag9Value(String tag9Value) {
		this.tag9Value = tag9Value;
		if(tag9Value != null){
			putQueryParameter("Tag.9.Value", tag9Value);
		}
	}

	public String getTag6Key() {
		return this.tag6Key;
	}

	public void setTag6Key(String tag6Key) {
		this.tag6Key = tag6Key;
		if(tag6Key != null){
			putQueryParameter("Tag.6.Key", tag6Key);
		}
	}

	public String getTag10Value() {
		return this.tag10Value;
	}

	public void setTag10Value(String tag10Value) {
		this.tag10Value = tag10Value;
		if(tag10Value != null){
			putQueryParameter("Tag.10.Value", tag10Value);
		}
	}

	public String getTag3Value() {
		return this.tag3Value;
	}

	public void setTag3Value(String tag3Value) {
		this.tag3Value = tag3Value;
		if(tag3Value != null){
			putQueryParameter("Tag.3.Value", tag3Value);
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

	public String getResourceId50() {
		return this.resourceId50;
	}

	public void setResourceId50(String resourceId50) {
		this.resourceId50 = resourceId50;
		if(resourceId50 != null){
			putQueryParameter("ResourceId.50", resourceId50);
		}
	}

	public String getTag16Value() {
		return this.tag16Value;
	}

	public void setTag16Value(String tag16Value) {
		this.tag16Value = tag16Value;
		if(tag16Value != null){
			putQueryParameter("Tag.16.Value", tag16Value);
		}
	}

	public String getTag1Key() {
		return this.tag1Key;
	}

	public void setTag1Key(String tag1Key) {
		this.tag1Key = tag1Key;
		if(tag1Key != null){
			putQueryParameter("Tag.1.Key", tag1Key);
		}
	}

	public String getTag8Key() {
		return this.tag8Key;
	}

	public void setTag8Key(String tag8Key) {
		this.tag8Key = tag8Key;
		if(tag8Key != null){
			putQueryParameter("Tag.8.Key", tag8Key);
		}
	}

	public String getTag11Key() {
		return this.tag11Key;
	}

	public void setTag11Key(String tag11Key) {
		this.tag11Key = tag11Key;
		if(tag11Key != null){
			putQueryParameter("Tag.11.Key", tag11Key);
		}
	}

	public String getTag2Value() {
		return this.tag2Value;
	}

	public void setTag2Value(String tag2Value) {
		this.tag2Value = tag2Value;
		if(tag2Value != null){
			putQueryParameter("Tag.2.Value", tag2Value);
		}
	}

	@Override
	public Class<TagResourcesResponse> getResponseClass() {
		return TagResourcesResponse.class;
	}

}
