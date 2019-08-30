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

package com.aliyuncs.drds.model.v20190123;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class RearrangeDbToInstanceRequest extends RpcAcsRequest<RearrangeDbToInstanceResponse> {
	
	public RearrangeDbToInstanceRequest() {
		super("Drds", "2019-01-23", "RearrangeDbToInstance", "drds");
	}

	private String chooseSubDb;

	private List<String> instanceLists;

	private String dbName;

	private String orderId;

	private String chooseRds;

	private String drdsInstanceId;

	public String getChooseSubDb() {
		return this.chooseSubDb;
	}

	public void setChooseSubDb(String chooseSubDb) {
		this.chooseSubDb = chooseSubDb;
		if(chooseSubDb != null){
			putQueryParameter("ChooseSubDb", chooseSubDb);
		}
	}

	public List<String> getInstanceLists() {
		return this.instanceLists;
	}

	public void setInstanceLists(List<String> instanceLists) {
		this.instanceLists = instanceLists;	
		if (instanceLists != null) {
			for (int i = 0; i < instanceLists.size(); i++) {
				putQueryParameter("InstanceList." + (i + 1) , instanceLists.get(i));
			}
		}	
	}

	public String getDbName() {
		return this.dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
		if(dbName != null){
			putQueryParameter("DbName", dbName);
		}
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
		if(orderId != null){
			putQueryParameter("OrderId", orderId);
		}
	}

	public String getChooseRds() {
		return this.chooseRds;
	}

	public void setChooseRds(String chooseRds) {
		this.chooseRds = chooseRds;
		if(chooseRds != null){
			putQueryParameter("ChooseRds", chooseRds);
		}
	}

	public String getDrdsInstanceId() {
		return this.drdsInstanceId;
	}

	public void setDrdsInstanceId(String drdsInstanceId) {
		this.drdsInstanceId = drdsInstanceId;
		if(drdsInstanceId != null){
			putQueryParameter("DrdsInstanceId", drdsInstanceId);
		}
	}

	@Override
	public Class<RearrangeDbToInstanceResponse> getResponseClass() {
		return RearrangeDbToInstanceResponse.class;
	}

}
