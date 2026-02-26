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

import com.aliyuncs.lto.model.v20210707.DescribeBizChainStatInfoResponse;
import com.aliyuncs.lto.model.v20210707.DescribeBizChainStatInfoResponse.BizChainStatInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBizChainStatInfoResponseUnmarshaller {

	public static DescribeBizChainStatInfoResponse unmarshall(DescribeBizChainStatInfoResponse describeBizChainStatInfoResponse, UnmarshallerContext _ctx) {
		
		describeBizChainStatInfoResponse.setRequestId(_ctx.stringValue("DescribeBizChainStatInfoResponse.RequestId"));
		describeBizChainStatInfoResponse.setCode(_ctx.stringValue("DescribeBizChainStatInfoResponse.Code"));
		describeBizChainStatInfoResponse.setHttpStatusCode(_ctx.integerValue("DescribeBizChainStatInfoResponse.HttpStatusCode"));
		describeBizChainStatInfoResponse.setMessage(_ctx.stringValue("DescribeBizChainStatInfoResponse.Message"));
		describeBizChainStatInfoResponse.setSuccess(_ctx.booleanValue("DescribeBizChainStatInfoResponse.Success"));

		List<BizChainStatInfo> data = new ArrayList<BizChainStatInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBizChainStatInfoResponse.Data.Length"); i++) {
			BizChainStatInfo bizChainStatInfo = new BizChainStatInfo();
			bizChainStatInfo.setUsedCount(_ctx.longValue("DescribeBizChainStatInfoResponse.Data["+ i +"].UsedCount"));
			bizChainStatInfo.setBizChainName(_ctx.stringValue("DescribeBizChainStatInfoResponse.Data["+ i +"].BizChainName"));

			data.add(bizChainStatInfo);
		}
		describeBizChainStatInfoResponse.setData(data);
	 
	 	return describeBizChainStatInfoResponse;
	}
}