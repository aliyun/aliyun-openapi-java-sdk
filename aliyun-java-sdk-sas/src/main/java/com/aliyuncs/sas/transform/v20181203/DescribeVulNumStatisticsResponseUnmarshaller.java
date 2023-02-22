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

import com.aliyuncs.sas.model.v20181203.DescribeVulNumStatisticsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVulNumStatisticsResponseUnmarshaller {

	public static DescribeVulNumStatisticsResponse unmarshall(DescribeVulNumStatisticsResponse describeVulNumStatisticsResponse, UnmarshallerContext _ctx) {
		
		describeVulNumStatisticsResponse.setRequestId(_ctx.stringValue("DescribeVulNumStatisticsResponse.RequestId"));
		describeVulNumStatisticsResponse.setImageVulAsapSum(_ctx.integerValue("DescribeVulNumStatisticsResponse.ImageVulAsapSum"));
		describeVulNumStatisticsResponse.setAppNum(_ctx.integerValue("DescribeVulNumStatisticsResponse.AppNum"));
		describeVulNumStatisticsResponse.setImageVulLaterSum(_ctx.integerValue("DescribeVulNumStatisticsResponse.ImageVulLaterSum"));
		describeVulNumStatisticsResponse.setScaNum(_ctx.integerValue("DescribeVulNumStatisticsResponse.ScaNum"));
		describeVulNumStatisticsResponse.setVulLaterSum(_ctx.integerValue("DescribeVulNumStatisticsResponse.VulLaterSum"));
		describeVulNumStatisticsResponse.setAppCnt(_ctx.integerValue("DescribeVulNumStatisticsResponse.AppCnt"));
		describeVulNumStatisticsResponse.setCveNum(_ctx.integerValue("DescribeVulNumStatisticsResponse.CveNum"));
		describeVulNumStatisticsResponse.setEmgNum(_ctx.integerValue("DescribeVulNumStatisticsResponse.EmgNum"));
		describeVulNumStatisticsResponse.setCmsDealedTotalNum(_ctx.integerValue("DescribeVulNumStatisticsResponse.CmsDealedTotalNum"));
		describeVulNumStatisticsResponse.setVulDealedTotalNum(_ctx.integerValue("DescribeVulNumStatisticsResponse.VulDealedTotalNum"));
		describeVulNumStatisticsResponse.setVulNntfSum(_ctx.integerValue("DescribeVulNumStatisticsResponse.VulNntfSum"));
		describeVulNumStatisticsResponse.setCmsNum(_ctx.integerValue("DescribeVulNumStatisticsResponse.CmsNum"));
		describeVulNumStatisticsResponse.setVulAsapSum(_ctx.integerValue("DescribeVulNumStatisticsResponse.VulAsapSum"));
		describeVulNumStatisticsResponse.setImageVulNntfSum(_ctx.integerValue("DescribeVulNumStatisticsResponse.ImageVulNntfSum"));
		describeVulNumStatisticsResponse.setSysNum(_ctx.integerValue("DescribeVulNumStatisticsResponse.SysNum"));
		describeVulNumStatisticsResponse.setImageVulTotalSum(_ctx.integerValue("DescribeVulNumStatisticsResponse.ImageVulTotalSum"));
	 
	 	return describeVulNumStatisticsResponse;
	}
}