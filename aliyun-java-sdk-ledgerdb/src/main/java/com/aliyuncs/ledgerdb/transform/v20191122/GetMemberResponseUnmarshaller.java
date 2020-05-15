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

package com.aliyuncs.ledgerdb.transform.v20191122;

import com.aliyuncs.ledgerdb.model.v20191122.GetMemberResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMemberResponseUnmarshaller {

	public static GetMemberResponse unmarshall(GetMemberResponse getMemberResponse, UnmarshallerContext _ctx) {
		
		getMemberResponse.setRequestId(_ctx.stringValue("GetMemberResponse.RequestId"));
		getMemberResponse.setLedgerId(_ctx.stringValue("GetMemberResponse.LedgerId"));
		getMemberResponse.setMemberId(_ctx.stringValue("GetMemberResponse.MemberId"));
		getMemberResponse.setAliUid(_ctx.stringValue("GetMemberResponse.AliUid"));
		getMemberResponse.setKeyType(_ctx.stringValue("GetMemberResponse.KeyType"));
		getMemberResponse.setPublicKey(_ctx.stringValue("GetMemberResponse.PublicKey"));
		getMemberResponse.setRole(_ctx.stringValue("GetMemberResponse.Role"));
		getMemberResponse.setState(_ctx.stringValue("GetMemberResponse.State"));
		getMemberResponse.setCreateTime(_ctx.longValue("GetMemberResponse.CreateTime"));
		getMemberResponse.setUpdateTime(_ctx.longValue("GetMemberResponse.UpdateTime"));
	 
	 	return getMemberResponse;
	}
}