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
package com.aliyuncs.oms.transform.v20150212;

import com.aliyuncs.oms.model.v20150212.GetUserDataResponse;
import com.aliyuncs.oms.model.v20150212.GetUserDataResponse.Data;
import com.aliyuncs.oms.model.v20150212.GetUserDataResponse.Data.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;


public class GetUserDataResponseUnmarshaller {

	public static GetUserDataResponse unmarshall(GetUserDataResponse getUserDataResponse, UnmarshallerContext context) {

		getUserDataResponse.setRequestId(context.stringValue("GetUserDataResponse.RequestId"));
		getUserDataResponse.setProductName(context.stringValue("GetUserDataResponse.ProductName"));
		getUserDataResponse.setDataType(context.stringValue("GetUserDataResponse.DataType"));
		getUserDataResponse.setNextToken(context.stringValue("GetUserDataResponse.NextToken"));

		List<Data> dataList = new ArrayList<Data>();
		for (int i = 0; i < context.lengthValue("GetUserDataResponse.DataList.Length"); i++) {
			Data  data = new Data();

			List<DataItem> dataItems = new ArrayList<DataItem>();
			for (int j = 0; j < context.lengthValue("GetUserDataResponse.DataList["+ i +"].DataItems.Length"); j++) {
				DataItem  dataItem = new DataItem();
				dataItem.setName(context.stringValue("GetUserDataResponse.DataList["+ i +"].DataItems["+ j +"].Name"));
				dataItem.setValue(context.stringValue("GetUserDataResponse.DataList["+ i +"].DataItems["+ j +"].Value"));

				dataItems.add(dataItem);
			}
			data.setDataItems(dataItems);

			dataList.add(data);
		}
		getUserDataResponse.setDataList(dataList);

		return getUserDataResponse;
	}
}