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

package com.aliyuncs.retailadvqa.transform.v20230417;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailadvqa.model.v20230417.MemberAccountDetailPageQueryResponse;
import com.aliyuncs.retailadvqa.model.v20230417.MemberAccountDetailPageQueryResponse.会员积分明细数据;
import com.aliyuncs.transform.UnmarshallerContext;


public class MemberAccountDetailPageQueryResponseUnmarshaller {

	public static MemberAccountDetailPageQueryResponse unmarshall(MemberAccountDetailPageQueryResponse memberAccountDetailPageQueryResponse, UnmarshallerContext _ctx) {
		
		memberAccountDetailPageQueryResponse.setRequestId(_ctx.stringValue("MemberAccountDetailPageQueryResponse.RequestId"));
		memberAccountDetailPageQueryResponse.setTotalCount(_ctx.integerValue("MemberAccountDetailPageQueryResponse.TotalCount"));
		memberAccountDetailPageQueryResponse.setSuccess(_ctx.stringValue("MemberAccountDetailPageQueryResponse.Success"));
		memberAccountDetailPageQueryResponse.setErrorCode(_ctx.stringValue("MemberAccountDetailPageQueryResponse.ErrorCode"));
		memberAccountDetailPageQueryResponse.setErrorMessage(_ctx.stringValue("MemberAccountDetailPageQueryResponse.ErrorMessage"));

		List<会员积分明细数据> data = new ArrayList<会员积分明细数据>();
		for (int i = 0; i < _ctx.lengthValue("MemberAccountDetailPageQueryResponse.Data.Length"); i++) {
			会员积分明细数据 会员积分明细数据 = new 会员积分明细数据();
			会员积分明细数据.setOpenMerchantId(_ctx.stringValue("MemberAccountDetailPageQueryResponse.Data["+ i +"].OpenMerchantId"));
			会员积分明细数据.setOuterMemberId(_ctx.stringValue("MemberAccountDetailPageQueryResponse.Data["+ i +"].OuterMemberId"));
			会员积分明细数据.setAccountType(_ctx.integerValue("MemberAccountDetailPageQueryResponse.Data["+ i +"].AccountType"));
			会员积分明细数据.setOperateType(_ctx.stringValue("MemberAccountDetailPageQueryResponse.Data["+ i +"].OperateType"));
			会员积分明细数据.setDetailValue(_ctx.stringValue("MemberAccountDetailPageQueryResponse.Data["+ i +"].DetailValue"));
			会员积分明细数据.setAccountBalance(_ctx.stringValue("MemberAccountDetailPageQueryResponse.Data["+ i +"].AccountBalance"));
			会员积分明细数据.setChannelCode(_ctx.stringValue("MemberAccountDetailPageQueryResponse.Data["+ i +"].ChannelCode"));
			会员积分明细数据.setActivityType(_ctx.stringValue("MemberAccountDetailPageQueryResponse.Data["+ i +"].ActivityType"));
			会员积分明细数据.setGmtCreate(_ctx.stringValue("MemberAccountDetailPageQueryResponse.Data["+ i +"].GmtCreate"));
			会员积分明细数据.setGmtModified(_ctx.stringValue("MemberAccountDetailPageQueryResponse.Data["+ i +"].GmtModified"));
			会员积分明细数据.setRemark(_ctx.stringValue("MemberAccountDetailPageQueryResponse.Data["+ i +"].Remark"));
			会员积分明细数据.setExtra(_ctx.stringValue("MemberAccountDetailPageQueryResponse.Data["+ i +"].Extra"));

			data.add(会员积分明细数据);
		}
		memberAccountDetailPageQueryResponse.setData(data);
	 
	 	return memberAccountDetailPageQueryResponse;
	}
}