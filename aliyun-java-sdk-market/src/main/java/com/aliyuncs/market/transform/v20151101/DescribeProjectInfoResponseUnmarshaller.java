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

package com.aliyuncs.market.transform.v20151101;

import com.aliyuncs.market.model.v20151101.DescribeProjectInfoResponse;
import com.aliyuncs.market.model.v20151101.DescribeProjectInfoResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeProjectInfoResponseUnmarshaller {

	public static DescribeProjectInfoResponse unmarshall(DescribeProjectInfoResponse describeProjectInfoResponse, UnmarshallerContext _ctx) {
		
		describeProjectInfoResponse.setRequestId(_ctx.stringValue("DescribeProjectInfoResponse.RequestId"));
		describeProjectInfoResponse.setSuccess(_ctx.booleanValue("DescribeProjectInfoResponse.Success"));

		Result result = new Result();
		result.setProductName(_ctx.stringValue("DescribeProjectInfoResponse.Result.ProductName"));
		result.setProjectStatus(_ctx.stringValue("DescribeProjectInfoResponse.Result.ProjectStatus"));
		result.setCustomerAliUid(_ctx.longValue("DescribeProjectInfoResponse.Result.CustomerAliUid"));
		result.setTemplateType(_ctx.stringValue("DescribeProjectInfoResponse.Result.TemplateType"));
		result.setInstanceId(_ctx.stringValue("DescribeProjectInfoResponse.Result.InstanceId"));
		result.setProductSkuName(_ctx.stringValue("DescribeProjectInfoResponse.Result.ProductSkuName"));
		result.setFinalStepNo(_ctx.integerValue("DescribeProjectInfoResponse.Result.FinalStepNo"));
		result.setCurrentStepNo(_ctx.integerValue("DescribeProjectInfoResponse.Result.CurrentStepNo"));
		result.setGmtExpired(_ctx.longValue("DescribeProjectInfoResponse.Result.GmtExpired"));
		result.setGmtFinished(_ctx.longValue("DescribeProjectInfoResponse.Result.GmtFinished"));
		result.setProductSkuCode(_ctx.stringValue("DescribeProjectInfoResponse.Result.ProductSkuCode"));
		result.setGmtCreate(_ctx.longValue("DescribeProjectInfoResponse.Result.GmtCreate"));
		result.setSupplierAliUid(_ctx.longValue("DescribeProjectInfoResponse.Result.SupplierAliUid"));
		result.setFinishType(_ctx.stringValue("DescribeProjectInfoResponse.Result.FinishType"));
		result.setTemplateId(_ctx.longValue("DescribeProjectInfoResponse.Result.TemplateId"));
		result.setOrderId(_ctx.longValue("DescribeProjectInfoResponse.Result.OrderId"));
		result.setProductCode(_ctx.stringValue("DescribeProjectInfoResponse.Result.ProductCode"));
		describeProjectInfoResponse.setResult(result);
	 
	 	return describeProjectInfoResponse;
	}
}