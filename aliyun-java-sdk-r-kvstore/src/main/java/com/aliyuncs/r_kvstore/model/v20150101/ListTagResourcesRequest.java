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
public class ListTagResourcesRequest extends RpcAcsRequest<ListTagResourcesResponse> {
	
	public ListTagResourcesRequest() {
		super("R-kvstore", "2015-01-01", "ListTagResources", "redisa");
	}

	private String resourceId47;

	private String resourceId48;

	private Long resourceOwnerId;

	private String resourceId49;

	private String resourceId40;

	private String resourceId41;

	private String resourceId42;

	private String tagKey9;

	private String resourceId1;

	private String resourceId43;

	private String resourceId2;

	private String resourceId44;

	private String resourceId3;

	private String resourceId45;

	private String resourceId4;

	private String resourceId46;

	private String resourceId5;

	private String tagKey4;

	private String resourceId6;

	private String tagKey3;

	private String resourceId7;

	private String tagKey2;

	private String resourceId8;

	private String tagKey1;

	private String resourceId9;

	private String tagKey8;

	private String tagKey20;

	private String securityToken;

	private String tagKey7;

	private String tagKey6;

	private String tagKey5;

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

	private String resourceId25;

	private String resourceId26;

	private String resourceId27;

	private String resourceId28;

	private String resourceId29;

	private String resourceId20;

	private String resourceId21;

	private String resourceId22;

	private String resourceId23;

	private String resourceId24;

	private String nextToken;

	private String resourceId14;

	private String resourceId15;

	private String resourceId16;

	private String tagKey19;

	private String resourceId17;

	private String tagKey18;

	private String resourceId18;

	private String resourceOwnerAccount;

	private String resourceId19;

	private String ownerAccount;

	private String resourceId50;

	private String resourceId10;

	private String resourceType;

	private String resourceId11;

	private String resourceId12;

	private String resourceId13;

	private String tagKey13;

	private String tagKey12;

	private String tagKey11;

	private String tagKey10;

	private String tagKey17;

	private String tagKey16;

	private String tagKey15;

	private String tagKey14;

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

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
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

	public String getTagKey9() {
		return this.tagKey9;
	}

	public void setTagKey9(String tagKey9) {
		this.tagKey9 = tagKey9;
		if(tagKey9 != null){
			putQueryParameter("TagKey.9", tagKey9);
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

	public String getTagKey4() {
		return this.tagKey4;
	}

	public void setTagKey4(String tagKey4) {
		this.tagKey4 = tagKey4;
		if(tagKey4 != null){
			putQueryParameter("TagKey.4", tagKey4);
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

	public String getTagKey3() {
		return this.tagKey3;
	}

	public void setTagKey3(String tagKey3) {
		this.tagKey3 = tagKey3;
		if(tagKey3 != null){
			putQueryParameter("TagKey.3", tagKey3);
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

	public String getTagKey2() {
		return this.tagKey2;
	}

	public void setTagKey2(String tagKey2) {
		this.tagKey2 = tagKey2;
		if(tagKey2 != null){
			putQueryParameter("TagKey.2", tagKey2);
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

	public String getTagKey1() {
		return this.tagKey1;
	}

	public void setTagKey1(String tagKey1) {
		this.tagKey1 = tagKey1;
		if(tagKey1 != null){
			putQueryParameter("TagKey.1", tagKey1);
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

	public String getTagKey8() {
		return this.tagKey8;
	}

	public void setTagKey8(String tagKey8) {
		this.tagKey8 = tagKey8;
		if(tagKey8 != null){
			putQueryParameter("TagKey.8", tagKey8);
		}
	}

	public String getTagKey20() {
		return this.tagKey20;
	}

	public void setTagKey20(String tagKey20) {
		this.tagKey20 = tagKey20;
		if(tagKey20 != null){
			putQueryParameter("TagKey.20", tagKey20);
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

	public String getTagKey7() {
		return this.tagKey7;
	}

	public void setTagKey7(String tagKey7) {
		this.tagKey7 = tagKey7;
		if(tagKey7 != null){
			putQueryParameter("TagKey.7", tagKey7);
		}
	}

	public String getTagKey6() {
		return this.tagKey6;
	}

	public void setTagKey6(String tagKey6) {
		this.tagKey6 = tagKey6;
		if(tagKey6 != null){
			putQueryParameter("TagKey.6", tagKey6);
		}
	}

	public String getTagKey5() {
		return this.tagKey5;
	}

	public void setTagKey5(String tagKey5) {
		this.tagKey5 = tagKey5;
		if(tagKey5 != null){
			putQueryParameter("TagKey.5", tagKey5);
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

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
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

	public String getResourceId16() {
		return this.resourceId16;
	}

	public void setResourceId16(String resourceId16) {
		this.resourceId16 = resourceId16;
		if(resourceId16 != null){
			putQueryParameter("ResourceId.16", resourceId16);
		}
	}

	public String getTagKey19() {
		return this.tagKey19;
	}

	public void setTagKey19(String tagKey19) {
		this.tagKey19 = tagKey19;
		if(tagKey19 != null){
			putQueryParameter("TagKey.19", tagKey19);
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

	public String getTagKey18() {
		return this.tagKey18;
	}

	public void setTagKey18(String tagKey18) {
		this.tagKey18 = tagKey18;
		if(tagKey18 != null){
			putQueryParameter("TagKey.18", tagKey18);
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

	public String getTagKey13() {
		return this.tagKey13;
	}

	public void setTagKey13(String tagKey13) {
		this.tagKey13 = tagKey13;
		if(tagKey13 != null){
			putQueryParameter("TagKey.13", tagKey13);
		}
	}

	public String getTagKey12() {
		return this.tagKey12;
	}

	public void setTagKey12(String tagKey12) {
		this.tagKey12 = tagKey12;
		if(tagKey12 != null){
			putQueryParameter("TagKey.12", tagKey12);
		}
	}

	public String getTagKey11() {
		return this.tagKey11;
	}

	public void setTagKey11(String tagKey11) {
		this.tagKey11 = tagKey11;
		if(tagKey11 != null){
			putQueryParameter("TagKey.11", tagKey11);
		}
	}

	public String getTagKey10() {
		return this.tagKey10;
	}

	public void setTagKey10(String tagKey10) {
		this.tagKey10 = tagKey10;
		if(tagKey10 != null){
			putQueryParameter("TagKey.10", tagKey10);
		}
	}

	public String getTagKey17() {
		return this.tagKey17;
	}

	public void setTagKey17(String tagKey17) {
		this.tagKey17 = tagKey17;
		if(tagKey17 != null){
			putQueryParameter("TagKey.17", tagKey17);
		}
	}

	public String getTagKey16() {
		return this.tagKey16;
	}

	public void setTagKey16(String tagKey16) {
		this.tagKey16 = tagKey16;
		if(tagKey16 != null){
			putQueryParameter("TagKey.16", tagKey16);
		}
	}

	public String getTagKey15() {
		return this.tagKey15;
	}

	public void setTagKey15(String tagKey15) {
		this.tagKey15 = tagKey15;
		if(tagKey15 != null){
			putQueryParameter("TagKey.15", tagKey15);
		}
	}

	public String getTagKey14() {
		return this.tagKey14;
	}

	public void setTagKey14(String tagKey14) {
		this.tagKey14 = tagKey14;
		if(tagKey14 != null){
			putQueryParameter("TagKey.14", tagKey14);
		}
	}

	@Override
	public Class<ListTagResourcesResponse> getResponseClass() {
		return ListTagResourcesResponse.class;
	}

}
