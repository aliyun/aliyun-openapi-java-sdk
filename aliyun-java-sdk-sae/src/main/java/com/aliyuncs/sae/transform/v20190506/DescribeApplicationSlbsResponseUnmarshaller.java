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

package com.aliyuncs.sae.transform.v20190506;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sae.model.v20190506.DescribeApplicationSlbsResponse;
import com.aliyuncs.sae.model.v20190506.DescribeApplicationSlbsResponse.Data;
import com.aliyuncs.sae.model.v20190506.DescribeApplicationSlbsResponse.Data.InternetItem;
import com.aliyuncs.sae.model.v20190506.DescribeApplicationSlbsResponse.Data.IntranetItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApplicationSlbsResponseUnmarshaller {

	public static DescribeApplicationSlbsResponse unmarshall(DescribeApplicationSlbsResponse describeApplicationSlbsResponse, UnmarshallerContext _ctx) {
		
		describeApplicationSlbsResponse.setRequestId(_ctx.stringValue("DescribeApplicationSlbsResponse.RequestId"));
		describeApplicationSlbsResponse.setMessage(_ctx.stringValue("DescribeApplicationSlbsResponse.Message"));
		describeApplicationSlbsResponse.setTraceId(_ctx.stringValue("DescribeApplicationSlbsResponse.TraceId"));
		describeApplicationSlbsResponse.setErrorCode(_ctx.stringValue("DescribeApplicationSlbsResponse.ErrorCode"));
		describeApplicationSlbsResponse.setCode(_ctx.stringValue("DescribeApplicationSlbsResponse.Code"));
		describeApplicationSlbsResponse.setSuccess(_ctx.booleanValue("DescribeApplicationSlbsResponse.Success"));

		Data data = new Data();
		data.setInternetIp(_ctx.stringValue("DescribeApplicationSlbsResponse.Data.InternetIp"));
		data.setInternetSlbId(_ctx.stringValue("DescribeApplicationSlbsResponse.Data.InternetSlbId"));
		data.setIntranetSlbId(_ctx.stringValue("DescribeApplicationSlbsResponse.Data.IntranetSlbId"));
		data.setIntranetIp(_ctx.stringValue("DescribeApplicationSlbsResponse.Data.IntranetIp"));
		data.setInternetSlbExpired(_ctx.booleanValue("DescribeApplicationSlbsResponse.Data.InternetSlbExpired"));
		data.setIntranetSlbExpired(_ctx.booleanValue("DescribeApplicationSlbsResponse.Data.IntranetSlbExpired"));
		data.setInternetSlbChargeType(_ctx.stringValue("DescribeApplicationSlbsResponse.Data.InternetSlbChargeType"));
		data.setIntranetSlbChargeType(_ctx.stringValue("DescribeApplicationSlbsResponse.Data.IntranetSlbChargeType"));

		List<IntranetItem> intranet = new ArrayList<IntranetItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApplicationSlbsResponse.Data.Intranet.Length"); i++) {
			IntranetItem intranetItem = new IntranetItem();
			intranetItem.setHttpsCertId(_ctx.stringValue("DescribeApplicationSlbsResponse.Data.Intranet["+ i +"].HttpsCertId"));
			intranetItem.setBizProtocol(_ctx.stringValue("DescribeApplicationSlbsResponse.Data.Intranet["+ i +"].Protocol"));
			intranetItem.setTargetPort(_ctx.integerValue("DescribeApplicationSlbsResponse.Data.Intranet["+ i +"].TargetPort"));
			intranetItem.setPort(_ctx.integerValue("DescribeApplicationSlbsResponse.Data.Intranet["+ i +"].Port"));
			intranetItem.setHttpsCaCertId(_ctx.stringValue("DescribeApplicationSlbsResponse.Data.Intranet["+ i +"].HttpsCaCertId"));
			intranetItem.setStickySession(_ctx.booleanValue("DescribeApplicationSlbsResponse.Data.Intranet["+ i +"].StickySession"));
			intranetItem.setStickySessionType(_ctx.stringValue("DescribeApplicationSlbsResponse.Data.Intranet["+ i +"].StickySessionType"));
			intranetItem.setCookieTimeout(_ctx.integerValue("DescribeApplicationSlbsResponse.Data.Intranet["+ i +"].CookieTimeout"));
			intranetItem.setCookie(_ctx.stringValue("DescribeApplicationSlbsResponse.Data.Intranet["+ i +"].Cookie"));

			intranet.add(intranetItem);
		}
		data.setIntranet(intranet);

		List<InternetItem> internet = new ArrayList<InternetItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApplicationSlbsResponse.Data.Internet.Length"); i++) {
			InternetItem internetItem = new InternetItem();
			internetItem.setHttpsCertId(_ctx.stringValue("DescribeApplicationSlbsResponse.Data.Internet["+ i +"].HttpsCertId"));
			internetItem.setBizProtocol(_ctx.stringValue("DescribeApplicationSlbsResponse.Data.Internet["+ i +"].Protocol"));
			internetItem.setTargetPort(_ctx.integerValue("DescribeApplicationSlbsResponse.Data.Internet["+ i +"].TargetPort"));
			internetItem.setPort(_ctx.integerValue("DescribeApplicationSlbsResponse.Data.Internet["+ i +"].Port"));
			internetItem.setHttpsCaCertId(_ctx.stringValue("DescribeApplicationSlbsResponse.Data.Internet["+ i +"].HttpsCaCertId"));
			internetItem.setStickySession(_ctx.booleanValue("DescribeApplicationSlbsResponse.Data.Internet["+ i +"].StickySession"));
			internetItem.setStickySessionType(_ctx.stringValue("DescribeApplicationSlbsResponse.Data.Internet["+ i +"].StickySessionType"));
			internetItem.setCookieTimeout(_ctx.integerValue("DescribeApplicationSlbsResponse.Data.Internet["+ i +"].CookieTimeout"));
			internetItem.setCookie(_ctx.stringValue("DescribeApplicationSlbsResponse.Data.Internet["+ i +"].Cookie"));

			internet.add(internetItem);
		}
		data.setInternet(internet);
		describeApplicationSlbsResponse.setData(data);
	 
	 	return describeApplicationSlbsResponse;
	}
}