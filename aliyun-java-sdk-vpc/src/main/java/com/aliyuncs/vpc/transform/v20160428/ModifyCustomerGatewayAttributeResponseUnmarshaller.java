/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.vpc.transform.v20160428;

import com.aliyuncs.vpc.model.v20160428.ModifyCustomerGatewayAttributeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyCustomerGatewayAttributeResponseUnmarshaller {

	public static ModifyCustomerGatewayAttributeResponse unmarshall(ModifyCustomerGatewayAttributeResponse modifyCustomerGatewayAttributeResponse, UnmarshallerContext context) {
		
		modifyCustomerGatewayAttributeResponse.setRequestId(context.stringValue("ModifyCustomerGatewayAttributeResponse.RequestId"));
		modifyCustomerGatewayAttributeResponse.setCustomerGatewayId(context.stringValue("ModifyCustomerGatewayAttributeResponse.CustomerGatewayId"));
		modifyCustomerGatewayAttributeResponse.setIpAddress(context.stringValue("ModifyCustomerGatewayAttributeResponse.IpAddress"));
		modifyCustomerGatewayAttributeResponse.setName(context.stringValue("ModifyCustomerGatewayAttributeResponse.Name"));
		modifyCustomerGatewayAttributeResponse.setDescription(context.stringValue("ModifyCustomerGatewayAttributeResponse.Description"));
		modifyCustomerGatewayAttributeResponse.setCreateTime(context.longValue("ModifyCustomerGatewayAttributeResponse.CreateTime"));
	 
	 	return modifyCustomerGatewayAttributeResponse;
	}
}