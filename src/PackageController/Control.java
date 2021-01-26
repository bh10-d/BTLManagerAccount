package PackageController;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.util.*;

public class Control{
	private String textYourMoney;
	private long longYourMoney;
	private String textDate;
	private Dates YourDate;
	private String[] arrTextDate;
	private String textDes;
	private Account account;
	private ArrayList<Account> temporaryStorage;
	private String textLabels;
	private storeData2 storeAccount;
	private String textdate;//nhan du lieu//
	private String textmoney;//nhan du lieu//
	
	public Control() {
		
	}
	
	public Control(String textdate, String textDes,String textmoney) {
		super();
		this.textdate = textdate;
		this.textDes = textDes;
		this.textmoney = textmoney;
		
	}
	
	
	
	
	public String getTextYourMoney() {
		return textYourMoney;
	}
	public void setTextYourMoney(String textYourMoney) {
		this.textYourMoney = textYourMoney;
	}
	public long getLongYourMoney() {
		return longYourMoney;
	}
	public void setLongYourMoney(long longYourMoney) {
		this.longYourMoney = longYourMoney;
	}
	public String getTextDate() {
		return textDate;
	}
	public void setTextDate(String textDate) {
		this.textDate = textDate;
	}
	public Dates getYourDate() {
		return YourDate;
	}
	public void setYourDate(Dates yourDate) {
		YourDate = yourDate;
	}
	public String[] getArrTextDate() {
		return arrTextDate;
	}
	public void setArrTextDate(String[] arrTextDate) {
		this.arrTextDate = arrTextDate;
	}
	public String getTextDes() {
		return textDes;
	}
	public void setTextDes(String textDes) {
		this.textDes = textDes;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public ArrayList<Account> getTemporaryStorage() {
		return temporaryStorage;
	}
	public void setTemporaryStorage(ArrayList<Account> temporaryStorage) {
		this.temporaryStorage = temporaryStorage;
	}
	public String getTextLabels() {
		return textLabels;
	}
	public void setTextLabels(String textLabels) {
		this.textLabels = textLabels;
	}
	public storeData2 getStoreAccount() {
		return storeAccount;
	}
	public void setStoreAccount(storeData2 storeAccount) {
		this.storeAccount = storeAccount;
	}
//	public String getTextdate() {
//		return textdate;
//	}
//	public void setTextdate(String textdate) {
//		this.textdate = textdate;
//	}
	public String getTextmoney() {
		return textmoney;
	}
	public void setTextmoney(String textmoney) {
		this.textmoney = textmoney;
	}
	
	@Override
	public String toString() {
		return "Date: "+textdate+", Description: "+textDes+", Money: "+textmoney;
	}
	
	
	
	
}