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

package com.aliyuncs.lto.transform.v20210707;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.lto.model.v20210707.DescribeMemberStatInfoResponse;
import com.aliyuncs.lto.model.v20210707.DescribeMemberStatInfoResponse.MemberStatInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMemberStatInfoResponseUnmarshaller {

	public static DescribeMemberStatInfoResponse unmarshall(DescribeMemberStatInfoResponse describeMemberStatInfoResponse, UnmarshallerContext _ctx) {
		
		describeMemberStatInfoResponse.setRequestId(_ctx.stringValue("DescribeMemberStatInfoResponse.RequestId"));
		describeMemberStatInfoResponse.setCode(_ctx.stringValue("DescribeMemberStatInfoResponse.Code"));
		describeMemberStatInfoResponse.setHttpStatusCode(_ctx.integerValue("DescribeMemberStatInfoResponse.HttpStatusCode"));
		describeMemberStatInfoResponse.setMessage(_ctx.stringValue("DescribeMemberStatInfoResponse.Message"));
		describeMemberStatInfoResponse.setSuccess(_ctx.booleanValue("DescribeMemberStatInfoResponse.Success"));

		List<MemberStatInfo> data = new ArrayList<MemberStatInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMemberStatInfoResponse.Data.Length"); i++) {
			MemberStatInfo memberStatInfo = new MemberStatInfo();
			memberStatInfo.setAuthorizedCount(_ctx.longValue("DescribeMemberStatInfoResponse.Data["+ i +"].AuthorizedCount"));
			memberStatInfo.setMemberId(_ctx.stringValue("DescribeMemberStatInfoResponse.Data["+ i +"].MemberId"));
			memberStatInfo.setMemberName(_ctx.stringValue("DescribeMemberStatInfoResponse.Data["+ i +"].MemberName"));
			memberStatInfo.setUsedCount(_ctx.longValue("DescribeMemberStatInfoResponse.Data["+ i +"].UsedCount"));
			memberStatInfo.setBizChainCount(_ctx.integerValue("DescribeMemberStatInfoResponse.Data["+ i +"].BizChainCount"));

			data.add(memberStatInfo);
		}
		describeMemberStatInfoResponse.setData(data);
	 
	 	return describeMemberStatInfoResponse;
	}
}