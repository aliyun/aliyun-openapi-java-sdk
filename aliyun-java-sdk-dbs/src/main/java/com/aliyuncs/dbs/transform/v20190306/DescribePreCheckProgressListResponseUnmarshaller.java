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

package com.aliyuncs.dbs.transform.v20190306;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dbs.model.v20190306.DescribePreCheckProgressListResponse;
import com.aliyuncs.dbs.model.v20190306.DescribePreCheckProgressListResponse.PreCheckProgressDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePreCheckProgressListResponseUnmarshaller {

	public static DescribePreCheckProgressListResponse unmarshall(DescribePreCheckProgressListResponse describePreCheckProgressListResponse, UnmarshallerContext _ctx) {
		
		describePreCheckProgressListResponse.setRequestId(_ctx.stringValue("DescribePreCheckProgressListResponse.RequestId"));
		describePreCheckProgressListResponse.setStatus(_ctx.stringValue("DescribePreCheckProgressListResponse.Status"));
		describePreCheckProgressListResponse.setProgress(_ctx.integerValue("DescribePreCheckProgressListResponse.Progress"));
		describePreCheckProgressListResponse.setSuccess(_ctx.booleanValue("DescribePreCheckProgressListResponse.Success"));
		describePreCheckProgressListResponse.setErrCode(_ctx.stringValue("DescribePreCheckProgressListResponse.ErrCode"));
		describePreCheckProgressListResponse.setErrMessage(_ctx.stringValue("DescribePreCheckProgressListResponse.ErrMessage"));
		describePreCheckProgressListResponse.setHttpStatusCode(_ctx.integerValue("DescribePreCheckProgressListResponse.HttpStatusCode"));

		List<PreCheckProgressDetail> items = new ArrayList<PreCheckProgressDetail>();
		for (int i = 0; i < _ctx.lengthValue("DescribePreCheckProgressListResponse.Items.Length"); i++) {
			PreCheckProgressDetail preCheckProgressDetail = new PreCheckProgressDetail();
			preCheckProgressDetail.setJobId(_ctx.stringValue("DescribePreCheckProgressListResponse.Items["+ i +"].JobId"));
			preCheckProgressDetail.setState(_ctx.stringValue("DescribePreCheckProgressListResponse.Items["+ i +"].State"));
			preCheckProgressDetail.setOrderNum(_ctx.stringValue("DescribePreCheckProgressListResponse.Items["+ i +"].OrderNum"));
			preCheckProgressDetail.setErrMsg(_ctx.stringValue("DescribePreCheckProgressListResponse.Items["+ i +"].ErrMsg"));
			preCheckProgressDetail.setNames(_ctx.stringValue("DescribePreCheckProgressListResponse.Items["+ i +"].Names"));
			preCheckProgressDetail.setItem(_ctx.stringValue("DescribePreCheckProgressListResponse.Items["+ i +"].Item"));
			preCheckProgressDetail.setBootTime(_ctx.longValue("DescribePreCheckProgressListResponse.Items["+ i +"].BootTime"));
			preCheckProgressDetail.setFinishTime(_ctx.longValue("DescribePreCheckProgressListResponse.Items["+ i +"].FinishTime"));

			items.add(preCheckProgressDetail);
		}
		describePreCheckProgressListResponse.setItems(items);
	 
	 	return describePreCheckProgressListResponse;
	}
}