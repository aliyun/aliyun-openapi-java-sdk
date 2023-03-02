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

import com.aliyuncs.lto.model.v20210707.DescribeMemberBizChainStatInfoResponse;
import com.aliyuncs.lto.model.v20210707.DescribeMemberBizChainStatInfoResponse.MemberBizChainStatInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMemberBizChainStatInfoResponseUnmarshaller {

	public static DescribeMemberBizChainStatInfoResponse unmarshall(DescribeMemberBizChainStatInfoResponse describeMemberBizChainStatInfoResponse, UnmarshallerContext _ctx) {
		
		describeMemberBizChainStatInfoResponse.setRequestId(_ctx.stringValue("DescribeMemberBizChainStatInfoResponse.RequestId"));
		describeMemberBizChainStatInfoResponse.setCode(_ctx.stringValue("DescribeMemberBizChainStatInfoResponse.Code"));
		describeMemberBizChainStatInfoResponse.setHttpStatusCode(_ctx.integerValue("DescribeMemberBizChainStatInfoResponse.HttpStatusCode"));
		describeMemberBizChainStatInfoResponse.setMessage(_ctx.stringValue("DescribeMemberBizChainStatInfoResponse.Message"));
		describeMemberBizChainStatInfoResponse.setSuccess(_ctx.booleanValue("DescribeMemberBizChainStatInfoResponse.Success"));

		List<MemberBizChainStatInfo> data = new ArrayList<MemberBizChainStatInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMemberBizChainStatInfoResponse.Data.Length"); i++) {
			MemberBizChainStatInfo memberBizChainStatInfo = new MemberBizChainStatInfo();
			memberBizChainStatInfo.setUsedCount(_ctx.longValue("DescribeMemberBizChainStatInfoResponse.Data["+ i +"].UsedCount"));
			memberBizChainStatInfo.setBizChainName(_ctx.stringValue("DescribeMemberBizChainStatInfoResponse.Data["+ i +"].BizChainName"));

			data.add(memberBizChainStatInfo);
		}
		describeMemberBizChainStatInfoResponse.setData(data);
	 
	 	return describeMemberBizChainStatInfoResponse;
	}
}