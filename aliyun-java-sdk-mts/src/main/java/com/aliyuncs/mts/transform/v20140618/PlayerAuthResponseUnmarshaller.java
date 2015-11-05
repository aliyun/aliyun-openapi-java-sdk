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
package com.aliyuncs.mts.transform.v20140618;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mts.model.v20140618.PlayerAuthResponse;
import com.aliyuncs.mts.model.v20140618.PlayerAuthResponse.Switch;
import com.aliyuncs.transform.UnmarshallerContext;


public class PlayerAuthResponseUnmarshaller {

	public static PlayerAuthResponse unmarshall(PlayerAuthResponse playerAuthResponse, UnmarshallerContext context) {
		
		playerAuthResponse.setRequestId(context.stringValue("PlayerAuthResponse.RequestId"));

		List<Switch> switchList = new ArrayList<Switch>();
		for (int i = 0; i < context.lengthValue("PlayerAuthResponse.SwitchList.Length"); i++) {
			Switch switch_ = new Switch();
			switch_.setState(context.stringValue("PlayerAuthResponse.SwitchList["+ i +"].State"));
			switch_.setFunctionId(context.stringValue("PlayerAuthResponse.SwitchList["+ i +"].FunctionId"));
			switch_.setSwitchId(context.stringValue("PlayerAuthResponse.SwitchList["+ i +"].SwitchId"));

			switchList.add(switch_);
		}
		playerAuthResponse.setSwitchList(switchList);
	 
	 	return playerAuthResponse;
	}
}