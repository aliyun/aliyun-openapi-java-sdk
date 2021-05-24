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

import com.aliyuncs.dts.model.v20200101.DescribeCenVpcResponse;
import com.aliyuncs.dts.model.v20200101.DescribeCenVpcResponse.CenVpcItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCenVpcResponseUnmarshaller {

	public static DescribeCenVpcResponse unmarshall(DescribeCenVpcResponse describeCenVpcResponse, UnmarshallerContext _ctx) {
		
		describeCenVpcResponse.setRequestId(_ctx.stringValue("DescribeCenVpcResponse.RequestId"));
		describeCenVpcResponse.setDynamicCode(_ctx.stringValue("DescribeCenVpcResponse.DynamicCode"));
		describeCenVpcResponse.setDynamicMessage(_ctx.stringValue("DescribeCenVpcResponse.DynamicMessage"));
		describeCenVpcResponse.setErrCode(_ctx.stringValue("DescribeCenVpcResponse.ErrCode"));
		describeCenVpcResponse.setErrMessage(_ctx.stringValue("DescribeCenVpcResponse.ErrMessage"));
		describeCenVpcResponse.setHttpStatusCode(_ctx.integerValue("DescribeCenVpcResponse.HttpStatusCode"));
		describeCenVpcResponse.setSuccess(_ctx.booleanValue("DescribeCenVpcResponse.Success"));

		List<CenVpcItem> cenVpc = new ArrayList<CenVpcItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCenVpcResponse.CenVpc.Length"); i++) {
			CenVpcItem cenVpcItem = new CenVpcItem();
			cenVpcItem.setEngine(_ctx.stringValue("DescribeCenVpcResponse.CenVpc["+ i +"].Engine"));
			cenVpcItem.setGroupId(_ctx.stringValue("DescribeCenVpcResponse.CenVpc["+ i +"].GroupId"));
			cenVpcItem.setInstanceId(_ctx.stringValue("DescribeCenVpcResponse.CenVpc["+ i +"].InstanceId"));
			cenVpcItem.setInstanceName(_ctx.stringValue("DescribeCenVpcResponse.CenVpc["+ i +"].InstanceName"));
			cenVpcItem.setIp(_ctx.stringValue("DescribeCenVpcResponse.CenVpc["+ i +"].Ip"));
			cenVpcItem.setPort(_ctx.stringValue("DescribeCenVpcResponse.CenVpc["+ i +"].Port"));
			cenVpcItem.setRegion(_ctx.stringValue("DescribeCenVpcResponse.CenVpc["+ i +"].Region"));
			cenVpcItem.setStatus(_ctx.stringValue("DescribeCenVpcResponse.CenVpc["+ i +"].Status"));
			cenVpcItem.setVpcCloudInstanceId(_ctx.stringValue("DescribeCenVpcResponse.CenVpc["+ i +"].VpcCloudInstanceId"));
			cenVpcItem.setVpcId(_ctx.stringValue("DescribeCenVpcResponse.CenVpc["+ i +"].VpcId"));

			cenVpc.add(cenVpcItem);
		}
		describeCenVpcResponse.setCenVpc(cenVpc);
	 
	 	return describeCenVpcResponse;
	}
}