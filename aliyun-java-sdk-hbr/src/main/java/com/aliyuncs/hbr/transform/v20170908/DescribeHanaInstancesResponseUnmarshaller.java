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

package com.aliyuncs.hbr.transform.v20170908;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbr.model.v20170908.DescribeHanaInstancesResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeHanaInstancesResponse.Hana;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHanaInstancesResponseUnmarshaller {

	public static DescribeHanaInstancesResponse unmarshall(DescribeHanaInstancesResponse describeHanaInstancesResponse, UnmarshallerContext _ctx) {
		
		describeHanaInstancesResponse.setRequestId(_ctx.stringValue("DescribeHanaInstancesResponse.RequestId"));
		describeHanaInstancesResponse.setSuccess(_ctx.booleanValue("DescribeHanaInstancesResponse.Success"));
		describeHanaInstancesResponse.setCode(_ctx.stringValue("DescribeHanaInstancesResponse.Code"));
		describeHanaInstancesResponse.setMessage(_ctx.stringValue("DescribeHanaInstancesResponse.Message"));
		describeHanaInstancesResponse.setTotalCount(_ctx.integerValue("DescribeHanaInstancesResponse.TotalCount"));
		describeHanaInstancesResponse.setPageSize(_ctx.integerValue("DescribeHanaInstancesResponse.PageSize"));
		describeHanaInstancesResponse.setPageNumber(_ctx.integerValue("DescribeHanaInstancesResponse.PageNumber"));

		List<Hana> hanas = new ArrayList<Hana>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHanaInstancesResponse.Hanas.Length"); i++) {
			Hana hana = new Hana();
			hana.setClusterId(_ctx.stringValue("DescribeHanaInstancesResponse.Hanas["+ i +"].ClusterId"));
			hana.setHanaName(_ctx.stringValue("DescribeHanaInstancesResponse.Hanas["+ i +"].HanaName"));
			hana.setVaultId(_ctx.stringValue("DescribeHanaInstancesResponse.Hanas["+ i +"].VaultId"));
			hana.setHost(_ctx.stringValue("DescribeHanaInstancesResponse.Hanas["+ i +"].Host"));
			hana.setInstanceNumber(_ctx.integerValue("DescribeHanaInstancesResponse.Hanas["+ i +"].InstanceNumber"));
			hana.setUserName(_ctx.stringValue("DescribeHanaInstancesResponse.Hanas["+ i +"].UserName"));
			hana.setUseSsl(_ctx.booleanValue("DescribeHanaInstancesResponse.Hanas["+ i +"].UseSsl"));
			hana.setValidateCertificate(_ctx.booleanValue("DescribeHanaInstancesResponse.Hanas["+ i +"].ValidateCertificate"));
			hana.setAlertSetting(_ctx.stringValue("DescribeHanaInstancesResponse.Hanas["+ i +"].AlertSetting"));
			hana.setContactId(_ctx.stringValue("DescribeHanaInstancesResponse.Hanas["+ i +"].ContactId"));
			hana.setStatus(_ctx.longValue("DescribeHanaInstancesResponse.Hanas["+ i +"].Status"));
			hana.setStatusMessage(_ctx.stringValue("DescribeHanaInstancesResponse.Hanas["+ i +"].StatusMessage"));

			hanas.add(hana);
		}
		describeHanaInstancesResponse.setHanas(hanas);
	 
	 	return describeHanaInstancesResponse;
	}
}