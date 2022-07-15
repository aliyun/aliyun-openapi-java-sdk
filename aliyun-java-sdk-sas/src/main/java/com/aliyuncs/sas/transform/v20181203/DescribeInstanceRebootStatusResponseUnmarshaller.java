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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeInstanceRebootStatusResponse;
import com.aliyuncs.sas.model.v20181203.DescribeInstanceRebootStatusResponse.RebootStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceRebootStatusResponseUnmarshaller {

	public static DescribeInstanceRebootStatusResponse unmarshall(DescribeInstanceRebootStatusResponse describeInstanceRebootStatusResponse, UnmarshallerContext _ctx) {
		
		describeInstanceRebootStatusResponse.setRequestId(_ctx.stringValue("DescribeInstanceRebootStatusResponse.RequestId"));
		describeInstanceRebootStatusResponse.setTotalCount(_ctx.integerValue("DescribeInstanceRebootStatusResponse.TotalCount"));

		List<RebootStatus> rebootStatuses = new ArrayList<RebootStatus>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceRebootStatusResponse.RebootStatuses.Length"); i++) {
			RebootStatus rebootStatus = new RebootStatus();
			rebootStatus.setUuid(_ctx.stringValue("DescribeInstanceRebootStatusResponse.RebootStatuses["+ i +"].Uuid"));
			rebootStatus.setRebootStatus(_ctx.integerValue("DescribeInstanceRebootStatusResponse.RebootStatuses["+ i +"].RebootStatus"));
			rebootStatus.setCode(_ctx.stringValue("DescribeInstanceRebootStatusResponse.RebootStatuses["+ i +"].Code"));
			rebootStatus.setMsg(_ctx.stringValue("DescribeInstanceRebootStatusResponse.RebootStatuses["+ i +"].Msg"));

			rebootStatuses.add(rebootStatus);
		}
		describeInstanceRebootStatusResponse.setRebootStatuses(rebootStatuses);
	 
	 	return describeInstanceRebootStatusResponse;
	}
}