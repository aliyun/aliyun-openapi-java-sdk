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

package com.aliyuncs.ltl.transform.v20190510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ltl.model.v20190510.DescribeMemberCapacityInfoResponse;
import com.aliyuncs.ltl.model.v20190510.DescribeMemberCapacityInfoResponse.MemberCapacityInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMemberCapacityInfoResponseUnmarshaller {

	public static DescribeMemberCapacityInfoResponse unmarshall(DescribeMemberCapacityInfoResponse describeMemberCapacityInfoResponse, UnmarshallerContext _ctx) {
		
		describeMemberCapacityInfoResponse.setRequestId(_ctx.stringValue("DescribeMemberCapacityInfoResponse.RequestId"));
		describeMemberCapacityInfoResponse.setCode(_ctx.integerValue("DescribeMemberCapacityInfoResponse.Code"));
		describeMemberCapacityInfoResponse.setSuccess(_ctx.booleanValue("DescribeMemberCapacityInfoResponse.Success"));
		describeMemberCapacityInfoResponse.setMessage(_ctx.stringValue("DescribeMemberCapacityInfoResponse.Message"));

		List<MemberCapacityInfo> data = new ArrayList<MemberCapacityInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMemberCapacityInfoResponse.Data.Length"); i++) {
			MemberCapacityInfo memberCapacityInfo = new MemberCapacityInfo();
			memberCapacityInfo.setMemberId(_ctx.stringValue("DescribeMemberCapacityInfoResponse.Data["+ i +"].MemberId"));
			memberCapacityInfo.setMemberName(_ctx.stringValue("DescribeMemberCapacityInfoResponse.Data["+ i +"].MemberName"));
			memberCapacityInfo.setMemberUid(_ctx.stringValue("DescribeMemberCapacityInfoResponse.Data["+ i +"].MemberUid"));
			memberCapacityInfo.setUsedCapacity(_ctx.stringValue("DescribeMemberCapacityInfoResponse.Data["+ i +"].UsedCapacity"));
			memberCapacityInfo.setUsedCount(_ctx.stringValue("DescribeMemberCapacityInfoResponse.Data["+ i +"].UsedCount"));

			data.add(memberCapacityInfo);
		}
		describeMemberCapacityInfoResponse.setData(data);
	 
	 	return describeMemberCapacityInfoResponse;
	}
}