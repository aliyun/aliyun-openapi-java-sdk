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

package com.aliyuncs.partnerbill.transform.v20200108;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.partnerbill.model.v20200108.GetPartnerInstancesMonthBillResponse;
import com.aliyuncs.partnerbill.model.v20200108.GetPartnerInstancesMonthBillResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPartnerInstancesMonthBillResponseUnmarshaller {

	public static GetPartnerInstancesMonthBillResponse unmarshall(GetPartnerInstancesMonthBillResponse getPartnerInstancesMonthBillResponse, UnmarshallerContext _ctx) {
		
		getPartnerInstancesMonthBillResponse.setRequestId(_ctx.stringValue("GetPartnerInstancesMonthBillResponse.RequestId"));
		getPartnerInstancesMonthBillResponse.setCode(_ctx.stringValue("GetPartnerInstancesMonthBillResponse.Code"));
		getPartnerInstancesMonthBillResponse.setSuccess(_ctx.booleanValue("GetPartnerInstancesMonthBillResponse.Success"));
		getPartnerInstancesMonthBillResponse.setMessage(_ctx.stringValue("GetPartnerInstancesMonthBillResponse.Message"));

		Data data = new Data();

		List<String> ossFiles = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetPartnerInstancesMonthBillResponse.Data.OssFiles.Length"); i++) {
			ossFiles.add(_ctx.stringValue("GetPartnerInstancesMonthBillResponse.Data.OssFiles["+ i +"]"));
		}
		data.setOssFiles(ossFiles);
		getPartnerInstancesMonthBillResponse.setData(data);
	 
	 	return getPartnerInstancesMonthBillResponse;
	}
}