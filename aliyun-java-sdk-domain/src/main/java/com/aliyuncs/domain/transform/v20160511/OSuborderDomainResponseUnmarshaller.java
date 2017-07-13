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
package com.aliyuncs.domain.transform.v20160511;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.domain.model.v20160511.OSuborderDomainResponse;
import com.aliyuncs.domain.model.v20160511.OSuborderDomainResponse.Object;
import com.aliyuncs.transform.UnmarshallerContext;


public class OSuborderDomainResponseUnmarshaller {

	public static OSuborderDomainResponse unmarshall(OSuborderDomainResponse oSuborderDomainResponse, UnmarshallerContext context) {
		
		oSuborderDomainResponse.setRequestId(context.stringValue("OSuborderDomainResponse.RequestId"));
		oSuborderDomainResponse.setTotalItemNum(context.integerValue("OSuborderDomainResponse.totalItemNum"));
		oSuborderDomainResponse.setCurrentPageNum(context.integerValue("OSuborderDomainResponse.currentPageNum"));
		oSuborderDomainResponse.setPageSize(context.integerValue("OSuborderDomainResponse.pageSize"));

		List<Object> data = new ArrayList<Object>();
		for (int i = 0; i < context.lengthValue("OSuborderDomainResponse.data.Length"); i++) {
			Object object = new Object();
			object.setCommodityKey(context.stringValue("OSuborderDomainResponse.data["+ i +"].commodityKey"));
			object.setCommodityCode(context.stringValue("OSuborderDomainResponse.data["+ i +"].commodityCode"));
			object.setAmount(context.longValue("OSuborderDomainResponse.data["+ i +"].amount"));
			object.setSettleTime(context.stringValue("OSuborderDomainResponse.data["+ i +"].settleTime"));

			data.add(object);
		}
		oSuborderDomainResponse.setData(data);
	 
	 	return oSuborderDomainResponse;
	}
}