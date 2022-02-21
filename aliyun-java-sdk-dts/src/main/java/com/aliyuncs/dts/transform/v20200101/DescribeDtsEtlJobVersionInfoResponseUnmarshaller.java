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

package com.aliyuncs.dts.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dts.model.v20200101.DescribeDtsEtlJobVersionInfoResponse;
import com.aliyuncs.dts.model.v20200101.DescribeDtsEtlJobVersionInfoResponse.DtsEtlJobVersionInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDtsEtlJobVersionInfoResponseUnmarshaller {

	public static DescribeDtsEtlJobVersionInfoResponse unmarshall(DescribeDtsEtlJobVersionInfoResponse describeDtsEtlJobVersionInfoResponse, UnmarshallerContext _ctx) {
		
		describeDtsEtlJobVersionInfoResponse.setRequestId(_ctx.stringValue("DescribeDtsEtlJobVersionInfoResponse.RequestId"));
		describeDtsEtlJobVersionInfoResponse.setSuccess(_ctx.booleanValue("DescribeDtsEtlJobVersionInfoResponse.Success"));
		describeDtsEtlJobVersionInfoResponse.setErrCode(_ctx.stringValue("DescribeDtsEtlJobVersionInfoResponse.ErrCode"));
		describeDtsEtlJobVersionInfoResponse.setPageNumber(_ctx.integerValue("DescribeDtsEtlJobVersionInfoResponse.PageNumber"));
		describeDtsEtlJobVersionInfoResponse.setPageRecordCount(_ctx.integerValue("DescribeDtsEtlJobVersionInfoResponse.PageRecordCount"));
		describeDtsEtlJobVersionInfoResponse.setTotalRecordCount(_ctx.integerValue("DescribeDtsEtlJobVersionInfoResponse.TotalRecordCount"));
		describeDtsEtlJobVersionInfoResponse.setErrMessage(_ctx.stringValue("DescribeDtsEtlJobVersionInfoResponse.ErrMessage"));
		describeDtsEtlJobVersionInfoResponse.setHttpStatusCode(_ctx.stringValue("DescribeDtsEtlJobVersionInfoResponse.HttpStatusCode"));
		describeDtsEtlJobVersionInfoResponse.setDynamicCode(_ctx.stringValue("DescribeDtsEtlJobVersionInfoResponse.DynamicCode"));
		describeDtsEtlJobVersionInfoResponse.setDynamicMessage(_ctx.stringValue("DescribeDtsEtlJobVersionInfoResponse.DynamicMessage"));

		List<DtsEtlJobVersionInfo> dtsEtlJobVersionInfos = new ArrayList<DtsEtlJobVersionInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDtsEtlJobVersionInfoResponse.DtsEtlJobVersionInfos.Length"); i++) {
			DtsEtlJobVersionInfo dtsEtlJobVersionInfo = new DtsEtlJobVersionInfo();
			dtsEtlJobVersionInfo.setStatus(_ctx.stringValue("DescribeDtsEtlJobVersionInfoResponse.DtsEtlJobVersionInfos["+ i +"].Status"));
			dtsEtlJobVersionInfo.setDtsJobName(_ctx.stringValue("DescribeDtsEtlJobVersionInfoResponse.DtsEtlJobVersionInfos["+ i +"].DtsJobName"));
			dtsEtlJobVersionInfo.setDtsJobId(_ctx.stringValue("DescribeDtsEtlJobVersionInfoResponse.DtsEtlJobVersionInfos["+ i +"].DtsJobId"));
			dtsEtlJobVersionInfo.setVersion(_ctx.integerValue("DescribeDtsEtlJobVersionInfoResponse.DtsEtlJobVersionInfos["+ i +"].Version"));
			dtsEtlJobVersionInfo.setDtsInstanceId(_ctx.stringValue("DescribeDtsEtlJobVersionInfoResponse.DtsEtlJobVersionInfos["+ i +"].DtsInstanceId"));
			dtsEtlJobVersionInfo.setCreateTime(_ctx.stringValue("DescribeDtsEtlJobVersionInfoResponse.DtsEtlJobVersionInfos["+ i +"].CreateTime"));
			dtsEtlJobVersionInfo.setSafeCheckpoint(_ctx.stringValue("DescribeDtsEtlJobVersionInfoResponse.DtsEtlJobVersionInfos["+ i +"].SafeCheckpoint"));
			dtsEtlJobVersionInfo.setCreator(_ctx.stringValue("DescribeDtsEtlJobVersionInfoResponse.DtsEtlJobVersionInfos["+ i +"].Creator"));
			dtsEtlJobVersionInfo.setModifyTime(_ctx.stringValue("DescribeDtsEtlJobVersionInfoResponse.DtsEtlJobVersionInfos["+ i +"].ModifyTime"));
			dtsEtlJobVersionInfo.setCreatorName(_ctx.stringValue("DescribeDtsEtlJobVersionInfoResponse.DtsEtlJobVersionInfos["+ i +"].CreatorName"));

			dtsEtlJobVersionInfos.add(dtsEtlJobVersionInfo);
		}
		describeDtsEtlJobVersionInfoResponse.setDtsEtlJobVersionInfos(dtsEtlJobVersionInfos);
	 
	 	return describeDtsEtlJobVersionInfoResponse;
	}
}