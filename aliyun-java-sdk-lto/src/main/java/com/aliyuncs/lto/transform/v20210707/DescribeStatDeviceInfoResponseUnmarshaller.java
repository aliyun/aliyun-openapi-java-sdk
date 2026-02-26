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

import com.aliyuncs.lto.model.v20210707.DescribeStatDeviceInfoResponse;
import com.aliyuncs.lto.model.v20210707.DescribeStatDeviceInfoResponse.Data;
import com.aliyuncs.lto.model.v20210707.DescribeStatDeviceInfoResponse.Data.BizChainInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStatDeviceInfoResponseUnmarshaller {

	public static DescribeStatDeviceInfoResponse unmarshall(DescribeStatDeviceInfoResponse describeStatDeviceInfoResponse, UnmarshallerContext _ctx) {
		
		describeStatDeviceInfoResponse.setRequestId(_ctx.stringValue("DescribeStatDeviceInfoResponse.RequestId"));
		describeStatDeviceInfoResponse.setCode(_ctx.stringValue("DescribeStatDeviceInfoResponse.Code"));
		describeStatDeviceInfoResponse.setHttpStatusCode(_ctx.integerValue("DescribeStatDeviceInfoResponse.HttpStatusCode"));
		describeStatDeviceInfoResponse.setMessage(_ctx.stringValue("DescribeStatDeviceInfoResponse.Message"));
		describeStatDeviceInfoResponse.setSuccess(_ctx.booleanValue("DescribeStatDeviceInfoResponse.Success"));

		Data data = new Data();
		data.setTotalAuthorizedCount(_ctx.integerValue("DescribeStatDeviceInfoResponse.Data.TotalAuthorizedCount"));
		data.setDistributableCount(_ctx.integerValue("DescribeStatDeviceInfoResponse.Data.DistributableCount"));

		List<BizChainInfo> bizChainList = new ArrayList<BizChainInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeStatDeviceInfoResponse.Data.BizChainList.Length"); i++) {
			BizChainInfo bizChainInfo = new BizChainInfo();
			bizChainInfo.setBizChainName(_ctx.stringValue("DescribeStatDeviceInfoResponse.Data.BizChainList["+ i +"].BizChainName"));
			bizChainInfo.setAuthorizedCount(_ctx.integerValue("DescribeStatDeviceInfoResponse.Data.BizChainList["+ i +"].AuthorizedCount"));

			bizChainList.add(bizChainInfo);
		}
		data.setBizChainList(bizChainList);
		describeStatDeviceInfoResponse.setData(data);
	 
	 	return describeStatDeviceInfoResponse;
	}
}