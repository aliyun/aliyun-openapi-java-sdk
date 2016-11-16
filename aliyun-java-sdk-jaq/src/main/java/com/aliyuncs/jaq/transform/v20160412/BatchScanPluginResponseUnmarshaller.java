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
package com.aliyuncs.jaq.transform.v20160412;

import com.aliyuncs.jaq.model.v20160412.BatchScanPluginResponse;
import com.aliyuncs.jaq.model.v20160412.BatchScanPluginResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchScanPluginResponseUnmarshaller {

	public static BatchScanPluginResponse unmarshall(BatchScanPluginResponse batchScanPluginResponse, UnmarshallerContext context) {
		
		batchScanPluginResponse.setErrorCode(context.integerValue("BatchScanPluginResponse.ErrorCode"));
		batchScanPluginResponse.setErrorMsg(context.stringValue("BatchScanPluginResponse.ErrorMsg"));

		Data data = new Data();
		data.setItemId(context.stringValue("BatchScanPluginResponse.Data.ItemId"));
		data.setProgress(context.integerValue("BatchScanPluginResponse.Data.Progress"));
		batchScanPluginResponse.setData(data);
	 
	 	return batchScanPluginResponse;
	}
}